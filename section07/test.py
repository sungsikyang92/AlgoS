from collections import deque

q = deque()

q.append((1, 2))
q.append((3, 4))
q.append((5, 6))

print(q)

p = q.popleft()
print(p[0])
print(p[1])
x, y = q.popleft()
print(x, y)