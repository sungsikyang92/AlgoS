p = [93, 30, 55]
s = [1, 30, 5]
stack = []
d = 0
count = 0
while p:
    if p[0] + d * s[0] >= 100:
        count += 1
        p.pop(0)
        s.pop(0)
    else:
        d += 1
        if count > 0:

