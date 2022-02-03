# 랜선자르기(결정알고리즘)
k, n = map(int, input().split())
length = []
for _ in range(k):
    length.append(int(input()))
# print(length)
# print(max(length))

def cnt_Cable_nums(length, mid_l):
    count = 0
    for i in length:
        count += i // mid_l
    return count
def lan_Cable_Cutting(length, n):
    min_l = 0
    max_l = max(length)
    result = 0
    while min_l <= max_l:
        mid_l = (min_l + max_l) // 2
        if cnt_Cable_nums(length, mid_l) >= n:
            result = mid_l
            min_l = mid_l + 1
        else:
            max_l = mid_l - 1
    return result

print(lan_Cable_Cutting(length, n))