n = 5
stages = [2, 1, 2, 6, 2, 4, 3, 3]

tmp = [0] * (n + 2)
print(tmp)
for x in stages:
    if x <= n:
        tmp[x%n] += 1
    elif x > n:
        tmp[x] += 1
print(tmp)
cnt = 1
while n == n + 1:
    for x in range(len(stages)):
        if stages[x] == cnt:
            print()