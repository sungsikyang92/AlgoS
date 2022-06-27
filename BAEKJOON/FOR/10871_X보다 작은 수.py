N, X = map(int,input().split())
arr = list(map(int, input().split()))
res = []
for x in arr:
    if x < X:
        res.append(x)
print(*res)