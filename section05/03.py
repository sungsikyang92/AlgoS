# 후위표기식 만들기

seq = input()
result = []
stk = []
for i in seq:
    if i.isdecimal():
        result.append(i)
    else:
        if i == "(":
            stk.append(i)
        elif i == ")":
            while stk and stk[-1] != "(":
                result.append(stk.pop())
            stk.pop()
        elif i == "*" or i == "/":
            while stk and (stk[-1] == "*" or stk[-1] == "/"):
                result.append(stk.pop())
            stk.append(i)
        elif i == "+" or i == "-":
            while stk and stk[-1] != "(":
                result.append(stk.pop())
            stk.append(i)

while stk:
    result.append(stk.pop())

print(*result)