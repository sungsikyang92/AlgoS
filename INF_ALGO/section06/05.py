# 바둑이 승차(DFS)
def DFS(L, sum, rest_sum):
    global result
    if sum + (total - rest_sum) < result:
        return
    if sum > c:
        return
    if L == n:
        if sum > result:
            result = sum
    else:
        DFS(L + 1, sum + dog_weight[L], rest_sum + dog_weight[L])
        DFS(L + 1, sum, rest_sum + dog_weight[L])

if __name__=="__main__":
    c, n = map(int, input().split())
    dog_weight = [int(input()) for _ in range(n)]
    # print(dog_weight)
    total = sum(dog_weight)
    result = -float("INF")
    DFS(0, 0, 0)
    print(result)