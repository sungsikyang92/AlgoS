n = int(input())
for x in range(n):
    r, s = map(str, input().split())
    r = int(r)
    for y in s:
        print(y*r, end='')
    print()