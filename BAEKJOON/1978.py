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

# 에라토스테네스의 체, 두 개의 배열이 필요하다.
# 1. 수를 지웠는지 아닌지
#       지웠으면 true, 지우지 않으면 false
# 2. 소수의 목록을 유지할 배열
