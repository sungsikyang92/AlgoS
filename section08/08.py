# 알리바바와 40인의 도둑(Top_Down)

def DFS(x, y):
    if dy[x][y] > 0:
        return dy[x][y]
    if x == 0 and y == 0:
        return arr[0][0]
    else:
        if y == 0:
            dy[x][y] = DFS(x - 1, y) + arr[x][y]
        elif x == 0:
            dy[x][y] = DFS(x, y - 1) + arr[x][y]
        else: #두 갈래의 길
            dy[x][y] = min(DFS(x - 1, y), DFS(x, y - 1)) + arr[x][y]
        return dy[x][y]


n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
dy = [[0] * n for _ in range(n)] #메모이제이션
print(DFS(n-1, n-1))