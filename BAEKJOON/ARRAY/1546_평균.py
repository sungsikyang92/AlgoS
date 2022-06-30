n = int(input())
list = list(map(int, input().split()))

M = max(list)

for i in range(n):
    list[i] = list[i]/M*100
result = sum(list)/n
print(result)