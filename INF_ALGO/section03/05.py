# 수들의 합

n, m = map(int, input().split())
arr = list(map(int, input().split()))
head, tail = 1, 0
arr_sum = arr[tail]
cnt = 0

while True:
    if arr_sum < m:
        if head < n:
            arr_sum += arr[head]
            head += 1
        else:
            break
    elif arr_sum == m:
        cnt += 1
        arr_sum -= arr[tail]
        tail += 1
    else: #arr_sum > m
        arr_sum -= arr[tail]
        tail += 1
print(cnt)