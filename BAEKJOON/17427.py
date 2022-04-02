# 약수의 합 2

n = int(input())
result = 0
for i in range(1, n + 1):
    result += (n // i) * i
print(result)