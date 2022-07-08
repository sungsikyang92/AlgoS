import sys
from collections import deque

input = sys.stdin.readline
n = int(input())
stk = deque()
chk = True
for x in range(n):
    cmd = list(map(str, input().rstrip().split()))
    if cmd[0] == "push":
        stk.append(cmd[1])
    elif cmd[0] == "pop":
        if not stk:
            print(-1)
        else:
            print(stk.popleft())
    elif cmd[0] == "size":
        print(len(stk))
    elif cmd[0] == "front":
        if not stk:
            print(-1)
        else:
            print(stk[0])
    elif cmd[0] == "back":
        if not stk:
            print(-1)
        else:
            print(stk[-1])
    elif cmd[0] == "empty":
        if stk:
            print(0)
        elif not stk:
            print(1)