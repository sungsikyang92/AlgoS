# m, n = map(int, input().split(" "))
# def is_prime(x):
#     if x < 2:
#         return False
#     i = 2
#     while i * i <= x:
#         if x % i == 0:
#             return False
#         i += 1
#     return True
#
# for i in range(m, n+1):
#     if is_prime(i):
#         print

max = 1000000

arr = [0] * (max+1)
arr[0] = arr[1] = True

for i in range(2, max+1):
    if not arr[i]:
        j = i+i