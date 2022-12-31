from collections import deque
prices = [1, 2, 3, 2, 3]
prices = deque(prices)
result = []
while prices:
    tmp = prices.popleft()
    cnt = 0
    for i in prices:
        if tmp <= i:
            cnt += 1
        else:
            cnt += 1
            break
    result.append(cnt)
print(result)
#










# from collections import deque
# def solution(prices):
#     answer = []
#     prices = deque(prices)
#     while prices:
#         c = prices.popleft()
#
#         count = 0
#         for i in prices:
#             if c > i:
#                 count += 1
#                 break
#             count += 1
#
#         answer.append(count)
#
#     return answer