n = 15
cnt = 0
for x in range(1, n + 1):
    sum_num = 0
    for y in range(x, n + 1):
        if sum_num == 15:
            cnt += 1
            break
        elif sum_num > 15:
            break
        else:
            sum_num += y

print(cnt + 1)