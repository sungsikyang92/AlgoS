# 가장 큰 수

num, m = map(str, input().split())
stack = []
for i in num:
    while stack and m > 0 and stack[-1] < i:
        stack.pop()
        m -= 1
    stack.append(i)