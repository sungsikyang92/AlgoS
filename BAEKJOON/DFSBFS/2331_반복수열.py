# 57 74 65 61 37 58 89 145 42 20 4 16
#             37 58 89 145 42 20 4 16
#             37 58 89 145 42 20

# a, b = map(str, input().split())
# print(a)
# print(b)
# tmp = [a]
# sum_a = 0
# tmp_num = 0
# len_tmp = -1
# while True:
#     if len(tmp) == len_tmp:
#         print(len(tmp))
#         break
#     for x in range(len(a)):
#         sum_a += int(a[x])*int(a[x])
#     tmp.append(sum_a)
#     tmp_num = sum_a
#     sum_a = 0
#     if tmp_num in tmp:
#         tmp.remove(tmp_num)
#     len_tmp = len(tmp)
a, b = map(int, input().split())
nums = [a]
while True:
    tmp = 0
    for s in str(nums[-1]):
        tmp += int(s) ** b

    if tmp in nums:
        break

    nums.append(tmp)

print(nums.index(tmp))