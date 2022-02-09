# 쇠막대기

stick = input()
stck= []
cnt = 0
for i in range(len(stick)):
    if stick[i] == '(':
        stck.append(i)
    elif stick[i] == ')' and stick[i - 1] == '(':
        stck.pop()
        cnt += len(stck)
    elif stick[i] == ')':
        stck.pop()
        cnt += 1

print(cnt)