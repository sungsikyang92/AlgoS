N = 5
stages = [2, 1, 2, 6, 2, 4, 3, 3]
# N = 4
# stages = [4,4,4,4,4]

# tmp = [0] * (n + 2)
# print(tmp)
# for x in stages:
#     if x <= n:
#         tmp[x%n] += 1
#     elif x > n:
#         tmp[x] += 1
# print(tmp)
# cnt = 1
# while n == n + 1:
#     for x in range(len(stages)):
#         if stages[x] == cnt:
#             print()
#
# def solution(N, stages):
#     answer = []
#     stages.sort()
#     # print(stages)
#     dw_cnt = len(stages)
#     up_cnt = 0
#     for i in range(1, N + 1):
#         dw_cnt -= up_cnt
#         up_cnt = 0
#         for j in stages:
#             if j == i:
#                 up_cnt += 1
#         # print(up_cnt)
#         # print(dw_cnt)
#         answer.append(up_cnt/dw_cnt)
#     #     print("***********************")
#     # for s in enumerate(answer, start=1):
#     #     print(s)
#     answer = enumerate(answer, start=1)
#     answer = sorted(answer, key = lambda x: -x[1])
#     return [x[0] for x in answer]

def solution(N, stages):
    result = {}
    ppl = len(stages)
    for stage in range(1, N + 1):
        if ppl != 0:
            count = stages.count(stage)
            result[stage] = count / ppl
            ppl -= count
        else:
            result[stage] = 0
    return sorted(result, key=lambda x:result[x], reverse=True)
print(solution(N,stages))