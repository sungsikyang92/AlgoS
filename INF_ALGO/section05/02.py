# 쇠막대기

stick = input()
stk = []
cnt = 0
for i in range(len(stick)):
    if stick[i] == '(':
        stk.append(i)
    elif stick[i] == ')' and stick[i - 1] == '(':
        stk.pop()
        cnt += len(stk)
    elif stick[i] == ')':
        stk.pop()
        cnt += 1

print(cnt)