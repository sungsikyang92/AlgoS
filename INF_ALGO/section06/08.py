# 순열 구하기
def DFS(L):
    global cnt
    if L == m:
        for i in range(m):
            print(result[i], end = ' ')
        print()
        cnt += 1
    else:
        for i in range(1, n + 1):
            if chk[i] == 0:
                chk[i] = 1
                result[L] = i
                DFS(L + 1)
                chk[i] = 0


if __name__=="__main__":
    n, m = map(int, input().split())
    result = [0] * n
    chk = [0] * (n + 1)
    cnt = 0
    DFS(0)
    print(cnt)