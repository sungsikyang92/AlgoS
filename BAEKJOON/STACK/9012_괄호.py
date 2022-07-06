t = int(input())

for x in range(t):
    cnt = 0
    PS = input().rstrip()
    for y in PS:
        if y == "(":
            cnt += 1
        elif y == ")":
            cnt -= 1
        if cnt < 0:
            print("NO")
            break
    if cnt == 0:
        print("YES")
    elif cnt > 0:
        print("NO")
