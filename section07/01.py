# 최대점수 구하기(DFS)

def DFS(L, sum, sum_time):
    global result
    if sum_time > m:
        return
    if L == n:
        if sum > result:
            result = sum
    else:
        DFS(L + 1, sum + point[L], sum_time + p_time[L])
        DFS(L + 1, sum, sum_time)


if __name__=="__main__":
    n, m = map(int, input().split())
    point = []
    p_time = []
    for i in range(n):
        a, b = map(int, input().split())
        point.append(a)
        p_time.append(b)
    result = -float("INF")
    DFS(0, 0, 0)
    print(result)