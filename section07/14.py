# 안전영역(BFS)

def DFS(h, x, y):
    chk[x][y] = 1
    for k in range(4):
        nx = x + dx[k]
        ny = y + dy[k]
        if 0 <= nx < n and 0 <= ny < n and chk[nx][ny] == 0 and safe_zone[nx][ny] > h:
            DFS(h, nx, ny)


dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
n = int(input())
safe_zone = [list(map(int, input())) for _ in range(n)]
# print(safe_zone)
# print(chk)
result = []

for h in range(100):
    chk = [[0 for _ in range(n)] for _ in range(n)]
    cnt = 0
    for i in range(n):
        for j in range(n):
            if safe_zone[i][j] > h and chk[i][j] == 0:
                cnt += 1
                DFS(h, i, j)
    result.append(cnt)
print(max(result))