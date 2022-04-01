participant = ["leo", "kiki", "eden"]
completion = ["eden", "kiki"]	#"leo"
#["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
#["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"

# def solution(participant, completion):
#     answer = ''
#     participant.sort()
#     completion.sort()
#     for i in range(len(completion)):
#         if completion[i] in participant:
#         else:
#             answer += completion[i]
#     return answer

# answer = ''
# participant.sort()
# completion.sort()
# print(participant)
# print(completion)
#
# for i in range(len(completion)):
#     if completion[i] in participant:
#         print(completion[i])
#         participant.remove(completion[i])
#
# print(participant)
# answer += participant[0]
# print(answer)
#
#
# # solution HASH
#
# def solution(participant, completion):
#     d = {}
#     for x in participant:
#         d[x] = d.get(x, 0) + 1
#     for x in completion:
#         d[x] -= 1
#     dnf = [k for k, v in d.items() if v > 0]
#     answer = dnf[0]
#     return answer
# print(solution(participant, completion))


# 유제환
from collections import defaultdict

def solution(participant, completion):
    d = defaultdict(int)

    for p in participant:
        d[p] += 1

    print(d)

    for c in completion:
        d[c] -= 1

    print(d)

    for name, count in d.items():
        if count !=0:
            return name

print(solution(participant,completion))