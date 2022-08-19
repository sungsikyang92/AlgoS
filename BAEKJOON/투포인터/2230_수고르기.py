N, M = map(int, input().split())
arr = []
for i in range(N):
    arr.append(int(input()))
arr.sort()
result = 2147483647

s_ptr = 0
e_ptr = 0

while s_ptr < N and e_ptr < N:
    if arr[e_ptr] - arr[s_ptr] < M:
        e_ptr+=1
    else:
        result = min(result,arr[e_ptr]-arr[s_ptr])
        s_ptr += 1
print(result)