# 양팔저울(DFS)

def DFS(L, sum):
    global result
    if L == n:
        if 0 < sum <= s:
            result.add(sum)

    else:
        DFS(L + 1, sum + w_list[L])
        DFS(L + 1, sum - w_list[L])
        DFS(L + 1, sum)

n = int(input())
w_list = list(map(int, input().split()))
s = sum(w_list)
result = set()
DFS(0, 0)
print(s - len(result))