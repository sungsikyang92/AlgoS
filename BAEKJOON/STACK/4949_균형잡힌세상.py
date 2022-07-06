while True:
    str = input()
    if str == '.':
        break
    stack = []
    chk = True
    for x in str:
        if x == "(" or x == "[":
            stack.append(x)
        elif x == ")":
            if not stack or stack[-1] == "[":
                chk = False
                break
            elif stack[-1] == "(":
                stack.pop()
        elif x == "]":
            if not stack or stack[-1] == "(":
                chk = False
                break
            elif stack[-1] == "[":
                stack.pop()
    if chk == True and not stack:
        print("yes")
    else:
        print("no")