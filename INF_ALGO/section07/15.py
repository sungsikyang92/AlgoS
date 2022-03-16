# 토마토(BFS 활용)
from collections import deque

m, n = map(int, input().split())
tomato_box = [list(map(int, input().split())) for _ in range(n)]
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
dq = deque()
result = [[0] * m for _ in range(n)]
# BFS 시작, 좌표값이 1인 값을 큐에 append 한다.
for i in range(n):
    for j in range(m):
        if tomato_box[i][j] == 1:
            dq.append((i, j))

while dq:
    x, y = dq.popleft()
    for k in range(4):
        nx = x + dx[k]
        ny = y + dy[k]
        if 0 <= nx < n and 0 <= ny < m and tomato_box[nx][ny] == 0:
            tomato_box[nx][ny] = 1
            result[nx][ny] = result[x][y] + 1
            dq.append((nx, ny))

flag = 1
for i in range(n):
    for j in range(m):
        if tomato_box[i][j] == 0:
            flag = 0
# print(result)
result_f = 0
if flag == 1:
    # print(max(result))
    for i in range(n):
        for j in range(m):
            if result[i][j] > result_f:
                result_f = result[i][j]
    print(result_f)
else:
    print(-1)