# 씨름 선수(그리디)

n = int(input())
ppl = []
result = []
for _ in range(n):
    ppl.append(list(map(int, input().split())))
# print(ppl)
# 키큰순 정렬
ppl.sort(reverse=True)
# print(ppl)
# # 가장 키큰사람 추가
# result.append(ppl.pop(0))
# # 무거운순 정렬
# ppl.sort(key = lambda x:-x[1])
# print(ppl)
# # 가장 무거운사람 추가
# result.append(ppl.pop(0))
# print(ppl)
# print(result)
# # 키큰순 정렬 다시
# ppl.sort(reverse=True)
w = 0
for i in range(n):
    if ppl[i][1] > w:
        # print(ppl[i][1])
        w = ppl[i][1]
        # print(w)
        result.append(ppl[i])
# print(result)
print(len(result))