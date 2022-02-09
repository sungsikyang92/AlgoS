# 후위식 연산

inp = input()

stk = []
for i in inp:
    if i.isdecimal():
        stk.append(i)
    else:
        b = int(stk.pop())
        a = int(stk.pop())
        if i == "+":
            stk.append(a + b)
        elif i == "-":
            stk.append(a - b)
        elif i == "*":
            stk.append(a * b)
        elif i == "/":
            stk.append(a / b)
print(*stk)