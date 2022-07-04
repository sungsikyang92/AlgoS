nums = set(range(1, 10001))
g_nums = set()

for x in nums:
    for y in str(x):
        x += int(y)
    g_nums.add(x)

result = sorted(nums-g_nums)
for x in result:
    print(x)