N, K = map(int, input().split())
n_list = list(map(int, input().split()))
result = []
for i in range(N):
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            result.append(n_list[k] + n_list[j] + n_list[i])
print(result)
result = set(result)
print(result)
result = list(result)
result.sort(reverse=True)
print(result)
print(result[K - 1])