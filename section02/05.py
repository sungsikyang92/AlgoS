from collections import Counter

N, M = map(int, input().split())
num_fre = [0] * (N+M+1)
max = -float('inf')
for i in range(1, N + 1):
    for j in range(1, M + 1):
        num_fre[i+j] = num_fre[i+j] + 1

for i in range(N+M+1):
    if num_fre[i] > max:
        max = num_fre[i]

for i in range(N+M+1):
    if num_fre[i] == max:
        print(i, end = ' ')