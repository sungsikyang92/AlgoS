# 소수 구하기

MAX = 1000000
check = [0] * (MAX + 1)
check[0] = check[1] = True

for i in range(2, MAX + 1):
    if not check[i]:
        j = i + i
        while j <= MAX:
            check[j] = True
            j += i

m, n = map(int, input().split())
for i in range(m, n + 1):
    if check[i] == False:
        print(i)
#
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
# m, n = map(int, input().split())
#
# for i in range(m, n + 1):
#     if is_prime(i):
#         print(i)