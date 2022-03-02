# 가장 높은 탑 쌓기

n = int(input())
bricks = []
for _ in range(n):
    a, b, c = list(map(int, input().split()))
    bricks.append((a, b, c))
# print(bricks)
bricks.sort(reverse=True)
# print(bricks)
# print(bricks[0][1])

dy = [0] * n
dy[0] = bricks[0][1]
result = bricks[0][1]

for i in range(1, n):
    max_h = 0
    for j in range(i - 1, -1, -1):
        if bricks[j][2] > bricks[i][2] and dy[j] > max_h:
            max_h = dy[j]
    dy[i] = max_h + bricks[i][1]
    result = max(result, dy[i])
print(result)