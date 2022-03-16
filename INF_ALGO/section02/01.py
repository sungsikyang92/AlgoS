n, k = map(int, input().split())

d_list = []
count = 0
for i in range(n):
    if n % (i + 1) == 0:
        d_list.append(n // (i + 1))
        count += 1
d_list.sort()
if count < k:
    print(-1)
else:
    print(d_list[k - 1])