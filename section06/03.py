# 부분집합 구하기(DFS)

def DFS(v):
    if v == n+1:
        for i in range(1, n + 1):
            if chk[i] == 1:
                print(i, end=' ')
        print()
    else:
        chk[v] = 1
        DFS(v + 1)
        chk[v] = 0
        DFS(v + 1)

if __name__=="__main__":
    n = int(input())
    chk = [0] * (n + 1)
    DFS(1)