# 단어 찾기

n = int(input())
pre_words = [input() for _ in range(n)]

for _ in range(n - 1):
    pre_words.remove(input())
    # print(pre_words)
print(*pre_words)
#
# n = int(input())
# pre_words = [input() for _ in range(n)]
# print(pre_words)
# used_words = [input() for _ in range(n - 1)]
# print(used_words)
#
# # for j in pre_words:
# #     for i in used_words:
# #         if j == i:
# #             pre_words.remove(j)
# #             print("after remove", pre_words)
# # print(pre_words)
# pre_words.sort()
# cnt = 0
# for i in pre_words:
#     chk_words = used_words
#     chk_words.sort()
#     print(chk_words)
#     print(pre_words)
#     cnt += 1
#     for j in chk_words:
#         print(cnt)
#         print("chk j", j)
#         print("chk i", i)
#         if i == j:
#             pre_words.pop(0)
# print(pre_words)