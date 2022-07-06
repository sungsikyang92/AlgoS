n = int(input())
stk = []
result = []
cnt = 0
flag = True
for i in range(n):
    num = int(input())

    while cnt < num:
        cnt += 1
        stk.append(cnt)
        result.append("+")

    if stk[-1] == num:
        stk.pop()
        result.append("-")
    else:
        print("NO")
        exit(0)
print("\n".join(result))
