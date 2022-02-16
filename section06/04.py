# 합이 같은 부분집합(DFS : 아마존 인터뷰)
import sys


def DFS(idx, sum):
    if idx == n:
        if sum == (total - sum):
            print("YES")
            sys.exit(0)
    else:
        DFS(idx + 1, sum + n_list[idx])
        DFS(idx + 1, sum)

if __name__=="__main__":
    n = int(input())
    n_list = list(map(int, input().split()))
    total = sum(n_list)
    DFS(0, 0)