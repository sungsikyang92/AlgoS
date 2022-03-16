# 합이 같은 부분집합(DFS : 아마존 인터뷰)
import sys


def DFS(L, sum):
    if L == n:
        if sum == (total - sum):
            print("YES")
            # return
            sys.exit(0)
    else:
        DFS(L + 1, sum + n_list[L])
        DFS(L + 1, sum)

if __name__=="__main__":
    n = int(input())
    n_list = list(map(int, input().split()))
    total = sum(n_list)
    DFS(0, 0)
    print("NO")
    # print(DFS(0, 0))