N, M = map(int, input().split())
# data = []
# for i in range(M):
#     data.append(list(map(int, input().split())))
data = [list(map(int, input().split())) for i in range(M)]
output = [[0] * N for _ in range(N)]
for i in range(M):
    output[data[i][0] - 1][data[i][1] - 1] = data[i][2]

for i in range(N):
    print(*output[i])