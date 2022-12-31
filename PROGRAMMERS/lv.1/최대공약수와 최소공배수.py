import math

# n = 3
# m = 12
n = 2
m = 5

# def gcd(n, m):
#     if n < m:
#         n, m = m, n
#     while m != 0:
#         n, m = m, n % m
#     return n
#
# def sol(n, m):
#     return [gcd(n,m),int(n*m/gcd(n,m))]
def sol(n,m):
    return [math.gcd(n,m), int(n*m/math.gcd(n,m))]

print(sol(n,m))