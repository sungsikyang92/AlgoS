# 응급실
from collections import deque

n, m = map(int, input().split())
waiting = list(map(int, input().split()))
# waiting = [(waiting[i], i) for i in range(n)]
# waiting = enumerate(waiting)
# enumerate한 상태에서 sort(key =lambda) 정렬 안됨. 어떻게해야할까..?
waiting = [(waiting[i], i) for i in range(n)]
waiting = deque(waiting)
# print(waiting[2][1])
result = []
# print(max(waiting)[1])
while True:
    # print("s", waiting[0][1])
    # print("max", max(waiting)[1])
    # print("max", max[0](waiting))
    if waiting[0][0] < (max(waiting)[0]):
        tmp = waiting.popleft()
        waiting.append(tmp)
    else:
        tmp = waiting.popleft()
        result.append(tmp)
        # print(result[-1][0])
        if result[-1][1] == m:
            break

print(len(result))
# for i, v in result:
#     if i == m:
#         print(i)
# print(result)