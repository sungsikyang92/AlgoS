# 사탕 게임

def check(x, n):
    result = 1
    for i in range(n):
        cnt = 1
        for j in range(1, n):
            if x[i][j] == x[i][j - 1]:
                cnt += 1
            else:
                cnt = 1
            if result < cnt:
                result = cnt
        cnt = 1
        for j in range(1, n):
            if x[j][i] == x[j - 1][i]:
                cnt += 1
            else:
                cnt = 1
            if result < cnt:
                result = cnt
    return result


n = int(input())
arr = [list(input()) for _ in range(n)]
# print(arr)
# for i in range(len(arr)):
#     print(arr[i])
# print(len(arr))
ans = 0
for i in range(n):
    for j in range(n):
        if j + 1 < n:
            arr[i][j], arr[i][j + 1] = arr[i][j + 1], arr[i][j]
            temp = check(arr, n)
            if ans < temp:
                ans = temp
            arr[i][j], arr[i][j + 1] = arr[i][j + 1], arr[i][j]
        if i + 1 < n:
            arr[i][j], arr[i + 1][j] = arr[i + 1][j], arr[i][j]
            temp = check(arr, n)
            if ans < temp:
                ans = temp
            arr[i][j], arr[i + 1][j] = arr[i + 1][j], arr[i][j]
print(ans)


