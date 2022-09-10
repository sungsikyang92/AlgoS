# nums = [1,2,3,4]
nums = [1,2,7,6,4]

def is_prime(x):
    if x < 2:
        return False
    i = 2
    while i * i <= x:
        if x % i == 0:
            return False
        i += 1
    return True

def solution(nums):
    answer = -1
    cnt = 0
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            num = 0
            for k in range(j+1, len(nums)):
                num = nums[i] + nums[j] + nums[k]
                if is_prime(num):
                    cnt += 1

    answer = cnt
    return answer

print(solution(nums))