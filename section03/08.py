# 곳감(모래시계)
from collections import deque
n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
# arr = deque(arr)
# print("original >>", arr)
m = int(input())
for _ in range(m):
    cmd = list(map(int, input().split()))
    r_num, direction, rpt = cmd[0] - 1, cmd[1], cmd[2]
    # print(arr[r_num])
    if direction == 0:
        for _ in range(rpt):
            arr[r_num].append(arr[r_num].pop(0))
            # print("왼쪽 >>", arr)
    else:
        for _ in range(rpt):
            arr[r_num] = deque(arr[r_num])
            arr[r_num].appendleft(arr[r_num].pop())
            # print("오른쪽 >>", arr)
# print("result >>", arr)
# print(arr[0])
# print(arr[1])
# print(arr[2][0])
# print(arr[3])
# print(arr[4])
r_ptr, l_ptr = 0, n
result = 0
for i in range(n):
    for j in range(r_ptr, l_ptr):
        result += arr[i][j]
    if i < n // 2:
        r_ptr += 1
        l_ptr -= 1
    else:
        r_ptr -= 1
        l_ptr += 1
print(result)