# 침몰하는 타이타닉(그리디)

n, m = map(int, input().split())
psg_list = [90]
cnt = 0
psg_list.sort()
while psg_list: # call by reference?
    if len(psg_list) == 1:
        cnt += 1
        break
    elif psg_list[0] + psg_list[-1] > m:
        psg_list.pop()
        cnt += 1
    else:
        psg_list.pop(0)
        psg_list.pop()
        cnt += 1
print(cnt)