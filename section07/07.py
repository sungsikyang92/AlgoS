# 송아지 찾기

from collections import deque
MAX = 10000
chk = [0] * (MAX + 1)
dis = [0] * (MAX + 1)
s, e = map(int, input().split())
chk[s] = 1
dis[s] = 0
dq = deque()
dq.append(s)

while dq:
    current = dq.popleft()
    if current == e:
        break
    for next in (current - 1, current + 1, current + 5):
        if 0 <= next <= MAX:
            if chk[next] == 0:
                dq.append(next)
                chk[next] = 1
                dis[next] = dis[current] + 1
print(dis[e])