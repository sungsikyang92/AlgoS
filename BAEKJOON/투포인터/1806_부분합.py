N, S = map(int, input().split())
arr = [int(i) for i in input().split()]
s_ptr = 0
e_ptr = 0
result = 100001
sum_arr = arr[0]
while True:
    if sum_arr >= S:
        result = min(result, e_ptr - s_ptr + 1)
        sum_arr -= arr[s_ptr]
        s_ptr += 1
    elif e_ptr == N - 1:
        break
    else:
        e_ptr += 1
        sum_arr += arr[e_ptr]
if result == 100001:
    print(0)
else:
    print(result)