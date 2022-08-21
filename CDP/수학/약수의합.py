# import sys
# input = sys.stdin.readline
# t = int(input())
#
# for i in range(t):
#     n = int(input())
#     result = 0
#     for i in range(1, n+1):
#         result += (n //i) * i
#     print(result)
MAX = 1000000;
d = [1] * (MAX+1)
s = [0] * (MAX+1)
for i in range(2, MAX+1):
    j = 1
    while i*j <= MAX:
        d[i*j] += i
        j += 1
