# 리모컨
ch = 100
n = int(input())
m = int(input())

if m > 0:
    dmg = list(map(int, input().split()))
else:
    dmg = []

for num in range(1000001):
    for i in str(num):
        if i in dmg:
            break
    else:
        ans = min()