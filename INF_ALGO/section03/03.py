# 카드 역배치(정올 기출)
card_List = list(range(21))
# print("original >>", card_List)
for _ in range(10):
    s, e = map(int, input().split())
    for i in range((e - s + 1) // 2):
        card_List[s + i], card_List[e - i] = card_List[e - i], card_List[s + i]
card_List.pop(0)
for i in card_List:
    print(i, end = ' ')

# card_List = list(range(21))
# editted_List = card_List
# print("original >>", card_List)
# s, e = 5, 10
# print(card_List[s])
# print(card_List[e])
# print(card_List[s:e + 1])
# print(card_List[e:s - 1:-1])
# card_List[s:e + 1] = editted_List[s:e - 1:-1]
# print(card_List)