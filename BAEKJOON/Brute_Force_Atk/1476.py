# 날짜 계산
e, s, m = map(int, input().split())

result = 1
a, b, c = 1, 1, 1
while True:
    if a == e and b == s and c == m:
        print(result)
        break
    a += 1
    b += 1
    c += 1
    if a == 16:
        a = 1
    if b == 29:
        b = 1
    if c == 20:
        c = 1
    result += 1