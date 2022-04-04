# 소수 찾기
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
m = list(map(int, input().split()))

cnt = 0
for i in m:
    if is_prime(i):
        cnt += 1
print(cnt)