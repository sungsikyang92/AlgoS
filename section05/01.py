# 가장 큰 수
# 어케 풀까..? 반복문으로 리스트에 집어넣어준다.
# 넣어줌에 있어서, 넣는것이 앞에 넣어져있는것보다 크면 뺀다(제외)...?
num, m = map(str, input().split())
m = int(m)
stk = []
for i in num:
    while stk and stk[-1] < i and m > 0:
        stk.pop()
        m -= 1
    stk.append(i)
# print(m)
if m != 0:
    stk = stk[:-m]

print(''.join(stk))