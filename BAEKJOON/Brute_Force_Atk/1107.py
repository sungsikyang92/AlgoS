# 리모컨

n = int(input())
m = int(input())
broken = [False] * 10
if m > 0:
    a = list(map(int, input().split()))
else:
    a = []

for x in a:     # x는 고장난것이다. 업데이트해준다.
    broken[x] = True

def possible(c):
    if c == 0:
        if broken[0]:
            return 0
        else:
            return 1
    l = 0
    while c > 0:
        if broken[c % 10]:
            return 0
        l += 1
        c //= 10
    return l

ans = abs(n - 100)
for i in range(1000001):
    c = i
    l = possible(c)
    if l > 0:
        press = abs(c - n)
        if ans > l + press:
            ans = l + press
print(ans)