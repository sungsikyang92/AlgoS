# 동전교환
def DFS(Level, sum):
    global result
    if Level >= result:
        return
    if sum > m:
        return
    if sum == m:
        if Level < result:
            result = Level
    else:
        for i in range(n):
            DFS(Level + 1, sum + n_type[i])

if __name__=="__main__":
    n = int(input())
    n_type = list(map(int, input().split()))
    m = int(input())
    result = float("INF")
    n_type.sort(reverse=True)
    DFS(0, 0)
    print(result)