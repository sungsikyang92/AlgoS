# nums = [3,1,2,3]
# nums = [3,3,3,2,2,4]
nums = [3,3,3,2,2,2]

def solution(nums):
    getPocket = int(len(nums) / 2)
    cnt = 0
    nums_set = list(set(nums))

    for i in nums_set:
        if cnt < getPocket:
            cnt += 1

    return cnt

# def solution(nums):
#     nums.sort()
#     getPocket = int(len(nums) / 2)
#     cnt = 1
#     for i in range(1, len(nums)):
#         if nums[i] != nums[i-1]:
#             cnt += 1
#         if cnt == getPocket:
#             break
#     return cnt
#
# print(solution(nums))
#