# 빗물
# https://www.acmicpc.net/problem/14719

h, w = map(int, input().split())
rainfall = list(map(int, input().split()))
# print(h, w, rainfall)

l_ptr = 0
r_ptr = w - 1
result = 0

max_left = rainfall[l_ptr]
max_right = rainfall[r_ptr]

while l_ptr < r_ptr:
    max_left = max(max_left, rainfall[l_ptr])
    max_right = max(max_right, rainfall[r_ptr])

    if max_right >= max_left:
        result += max_left - rainfall[l_ptr]
        l_ptr += 1
    else:
        result += max_right - rainfall[r_ptr]
        r_ptr -= 1

print(result)