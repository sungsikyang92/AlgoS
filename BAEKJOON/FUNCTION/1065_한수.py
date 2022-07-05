def seq(num):
    cnt = 0
    for i in range(1, num + 1):
        nlist = list(map(int, str(i)))
        if i < 100:
            cnt += 1
        elif nlist[0]-nlist[1] == nlist[1]-nlist[2]:
            cnt += 1
    return cnt

inp = int(input())
print(seq(inp))