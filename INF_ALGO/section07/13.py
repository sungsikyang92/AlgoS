# 섬나라 아일랜드(BFS)

from collections import deque
dx = [-1, -1, 0, 1, 1, 1, 0, -1]
dy = [0, 1, 1, 1, 0, -1, -1, -1]
n = int(input())
island = [list(map(str, input())) for _ in range(n)]
# print(island)             // int형으로 받으면 0이 사라진다.
# print(type(island[3][0]))
# print(type(int(island[3][0])))
cnt = 0
dq = deque()
for i in range(n):
    for j in range(n):
        if island[i][j] == '1':
            island[i][j] = 0
            dq.append((i, j))
            while dq:
                tmp = dq.popleft()
                for k in range(8):
                    nx = tmp[0] + dx[k]
                    ny = tmp[1] + dy[k]
                    if 0 <= nx < n and 0 <= ny < n and island[nx][ny] == '1':
                        island[nx][ny] = 0
                        dq.append((nx, ny))
            cnt += 1
print(cnt)