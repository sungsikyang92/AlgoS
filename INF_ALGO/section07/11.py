# 등산경로


n = int(input())
h_path = [list(map(int, input().split())) for _ in range(n)]
chk = [[0 for _ in range(n)] for _ in range(n)]
# print(h_path)
# print(chk)
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
cnt = 0
max = -float("INF")
min = float("INF")
# for i in h_path:
#     for j in i:
#         if max < j:
#             j = max
#             start_point = j
for i in range(n):
    for j in range(n):
        if h_path[i][j] > max:
            max = h_path[i][j]
            end_x = i
            end_y = j
        if h_path[i][j] < min:
            min = h_path[i][j]
            start_x = i
            start_y = j
chk[start_x][start_y] = 1


def DFS(x, y):
    global cnt
    if x == end_x and y == end_y:
        cnt += 1
    else:
        for k in range(4):
            n_x = x + dx[k]
            n_y = y + dy[k]
            if 0 <= n_x < n and 0 <= n_y < n and chk[n_x][n_y] == 0 and h_path[n_x][n_y] > h_path[x][y]:
                chk[n_x][n_y] = 1
                DFS(n_x, n_y)
                chk[n_x][n_y] = 0

DFS(start_x, start_y)
print(cnt)