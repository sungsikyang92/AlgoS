# 단지 번호 붙이기(DFS)

def DFS(x, y):
    global cnt
    cnt += 1
    apt[x][y] = 0
    for k in range(4):
        nx = x + dx[k]
        ny = y + dy[k]
        if 0 <= nx < n and 0 <= ny < n and apt[nx][ny] == 1:
            DFS(nx, ny)

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
n = int(input())
apt = [list(map(int, input())) for _ in range(n)]
result = []
for i in range(n):
    for j in range(n):
        if apt[i][j] == 1:
            cnt = 0
            DFS(i, j)
            result.append(cnt)

print(len(result))
result.sort()
for i in result:
    print(i)
# 단지 번호 붙이기(BFS)