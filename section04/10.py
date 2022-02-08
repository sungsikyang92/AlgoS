# 역수열(그리디)

n = int(input())
n_list = list(map(int, input().split()))
result = [0] * n
for i in range(n):
    for j in range(n):
        if n_list[i] == 0 and result[j] == 0:
            result[j] = i + 1
            break
        elif result[j] == 0:
            n_list[i] -= 1
print(*result)