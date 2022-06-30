list = []

for x in range(10):
    n = int(input())
    c = n % 42
    if c not in list:
        list.append(c)
print(len(list))

# list = []
#
# for x in range(10):
#     n = int(input())
#     c = n % 42
#     if c in list:
#         continue
#     else:
#         list.append(c)
# print(len(list))