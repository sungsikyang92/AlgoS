s = "110010101001"
answer = []
cnt = 0
cnt_cycle = 0
while len(s) > 1:
    cnt_zero = s.count('0')
    cnt += cnt_zero
    s = bin(s.count('1'))[2:]
    cnt_cycle += 1
answer.append(cnt_cycle)
answer.append(cnt)
print(answer)