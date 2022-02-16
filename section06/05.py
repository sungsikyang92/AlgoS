# 바둑이 승차(DFS)
def DFS(idx, sum, rest_sum):
    global result
    if sum + (total - rest_sum) < result:
        return
    if sum > c:
        return
    if idx == n:
        if sum > result:
            result = sum
    else:
        DFS(idx + 1, sum + dog_weight[idx], rest_sum + dog_weight[idx])
        DFS(idx + 1, sum, rest_sum + dog_weight[idx])

if __name__=="__main__":
    c, n = map(int, input().split())
    dog_weight = [int(input()) for _ in range(n)]
    # print(dog_weight)
    total = sum(dog_weight)
    result = -float("INF")
    DFS(0, 0, 0)
    print(result)