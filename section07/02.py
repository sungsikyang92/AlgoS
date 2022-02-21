# 휴가(삼성 SW역량평가 기출문제 : DFS활용)
def DFS(L, sum):
    global result
    if L == n + 1:
        if sum > result:
            result = sum
    else:
        if L + time[L] <= n + 1:
            DFS(L + time[L], sum + pay[L])
        DFS(L + 1, sum)

n = int(input())
time = [0]
pay = [0]
for _ in range(n):
    a, b = map(int, input().split())
    time.append(a)
    pay.append(b)
result = -float("INF")
DFS(1, 0)
print(result)