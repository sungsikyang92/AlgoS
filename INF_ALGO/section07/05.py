# 동전 분배하기(DFS)
def DFS(L):
    global result
    if L == n:
        diff = max(money) - min(money)
        if diff < result:
            tmp = set()
            for x in money:
                tmp.add(x)
            if len(tmp) == 3:
                result = diff
    else:
        for i in range(3):
            money[i] += coin[L]
            DFS(L + 1)
            money[i] -= coin[L]
n = int(input())
coin = []
tmp = []
money = [0] * 3
result = float("INF")
for _ in range(n):
    coin.append(int(input()))
DFS(0)
print(result)
