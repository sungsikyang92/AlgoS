# 벽 부수고 이동하기

dx = [1, -1, 0, 0]
dy = [0, 0, -1, 1]
def bfs(n, m, maze):



n, m = map(int, input().split())
maze = []
for i in range(n):
    maze.append(list(map(int, input())))
# print(n, m)
# print(maze)
print(bfs(n, m, maze))