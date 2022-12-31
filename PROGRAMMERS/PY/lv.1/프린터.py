# def solution(priorities, location):
#     queue =  [(i,p) for i,p in enumerate(priorities)]
#     answer = 0
#     while True:
#         cur = queue.pop(0)
#         if any(cur[1] < q[1] for q in queue):
#             queue.append(cur)
#         else:
#             answer += 1
#             if cur[0] == location:
#                 return answer


# p = [2, 1, 3, 2]
# l = 2
p = [1,1,9,1,1,1]
l = 0
from collections import deque

h = [x for x in range(len(p))]
h = deque(h)
print(h)
dp = deque(p)
print(dp)
# max_dp = max(dp)
# print(max_dp)
result = []
result_h = []
while dp:
    max_dp = max(dp)
    a = dp.popleft()
    b = h.popleft()
    if a < max_dp:
        dp.append(a)
        h.append(b)
    elif a == max_dp:
        result.append(a)
        result_h.append(b)

print(result)
print(result_h)

print(result_h.index(l)+1)
