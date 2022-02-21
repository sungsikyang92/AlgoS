# 동전 바꿔주기(DFS)

def DFS(L, sum):
    global cnt
    if sum > t:
        return
    if L == k:
        if sum == t:
            cnt += 1
    else:
        for i in range(coin_value[L] + 1):
            DFS(L + 1, sum + (coin[L] * i))

t = int(input())
k = int(input())
coin = []
coin_value = []
for _ in range(k):
    a, b = map(int,input().split())
    coin.append(a)
    coin_value.append(b)
cnt = 0
DFS(0, 0)
print(cnt)