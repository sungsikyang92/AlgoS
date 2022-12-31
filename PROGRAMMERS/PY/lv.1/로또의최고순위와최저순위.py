# lottos = [44, 1, 0, 0, 31, 25]
# win_nums = [31, 10, 45, 1, 6, 19]
# lottos = [0, 0, 0, 0, 0, 0]
# win_nums = [38, 19, 20, 40, 15, 25]
lottos = [45, 4, 35, 20, 3, 9]
win_nums = [20, 9, 3, 45, 4, 35]

# print(sorted(lottos))
# print(sorted(win_nums))
cnt_unknown = 0
cnt_correct = 0
for i in lottos:
    if i in win_nums:
        cnt_correct += 1
# print(cnt_correct)

for i in lottos:
    if i == 0:
        cnt_unknown += 1
# print(cnt_unknown)
max_correct = cnt_correct + cnt_unknown
min_correct = cnt_correct
# print(max_correct)
result = [0, 0]
if max_correct == 6:
    result[0] = 1
elif max_correct == 5:
    result[0] = 2
elif max_correct == 4:
    result[0] = 3
elif max_correct == 3:
    result[0] = 4
elif max_correct == 2:
    result[0] = 5
else:
    result[0] = 6

if min_correct == 6:
    result[1] = 1
elif min_correct == 5:
    result[1] = 2
elif min_correct == 4:
    result[1] = 3
elif min_correct == 3:
    result[1] = 4
elif min_correct == 2:
    result[1] = 5
else:
    result[1] = 6

print(result)