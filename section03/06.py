# 격자판 최대합
n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
arr_sum = []
# 행
for i in range(n):
    r_sum = 0
    for j in range(n):
        r_sum += arr[i][j]
    arr_sum.append(r_sum)
# print(arr_sum)
# 열
for i in range(n):
    c_sum = 0
    for j in range(n):
        c_sum += arr[j][i]
    arr_sum.append(c_sum)
# print(arr_sum)
# 대각선
l_sum = 0
for i in range(n):
    l_sum += arr[i][i]
arr_sum.append(l_sum)
r_sum = 0
for i in range(n - 1, -1, -1):
    r_sum += arr[i][i]
arr_sum.append(r_sum)
# print(arr_sum)
print(max(arr_sum))