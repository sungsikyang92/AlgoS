n = int(input())

for x in range(n):
    tmp = list(map(int, input().split()))
    tmp_sum = 0
    for i in range(1, tmp[0] + 1):
        tmp_sum += tmp[i]
    avg = tmp_sum/tmp[0]
    cnt = 0
    for y in range(1, tmp[0] + 1):
        if tmp[y] > avg:
            cnt += 1
    result = cnt/tmp[0]*100
    print("{0:.3f}{1}".format(result, "%"))