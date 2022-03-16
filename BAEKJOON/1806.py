# 부분합

from collections import deque

n, s = map(int, input().split())
# print(n, s)
arr = list(map(int, input().split()))

# 시간초과!!

# arr = deque(arr)
# # print(arr)
# result = deque()
# r_len = []
#
# l_ptr = arr[0]
# r_ptr = arr[1]
#
# while True:
#     if sum(result) >= s:
#         r_len.append(len(result))
#         result.popleft()
#         l_ptr += 1
#     elif r_ptr == n:
#         break
#     else:
#         result.append(arr[0])
#         arr.popleft()
#         r_ptr += 1
#
# print(min(r_len))

l_ptr, r_ptr = 0, 0
result = 100001
tmp_sum = arr[0]

while True:
    if tmp_sum >= s:
        tmp_sum -= arr[l_ptr]
        result = min(result, r_ptr - l_ptr + 1)
        l_ptr += 1
    else:
        r_ptr += 1
        if r_ptr == n:
            break
        tmp_sum += arr[r_ptr]

if result == 100001:
    print(0)
else:
    print(result)