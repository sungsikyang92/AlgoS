def is_prime(x):
    if x < 2:
        return False
    i = 2
    while i * i <= x:
        if x % i == 0:
            return False
        i += 1
    return True

n = int(input())
nums = [int(i) for i in input().split(" ")]
result = 0
for x in nums:
    if is_prime(x):
        result += 1
print(result)