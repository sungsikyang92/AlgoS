# d = [1,3,2,5,4]
# budget = 9
d = [2,2,3,3]
budget = 10


def solution(d, budget):
    answer = -1
    d.sort()
    for i in range(len(d)):
        tmp = d[i]
        cnt = 1
        for j in range(i+1, len(d)):
            tmp += d[j]
            cnt += 1
            if tmp > budget:
                tmp -= d[i]
                cnt -= 1
        if cnt > answer:
            answer = cnt
    return answer

#
# def solution(d, budget):
#     answer = 0
#     d.sort()
#     tmp = 0
#     cnt = 0
#     for i in range(len(d)):
#         tmp += d[i]
#         cnt += 1
#         if tmp > budget:
#             tmp -= d[i]
#             cnt -= 1
#     return answer

print(solution(d, budget))