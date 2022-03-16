# 주사위 게임

n = int(input())
max_prize = 0
sum = 0
for i in range(n):
    d_list = list(map(int, input().split()))
    d_list.sort()
    a, b, c = d_list[0], d_list[1], d_list[2]
    if a == b == c:
        sum = 10000 + (a * 1000)
    elif a == b or b == c or c == a:
        if a == b or c == a:
            sum = 1000 + (a * 100)
        elif b == c:
            sum = 1000 + (b * 100)
    else:
        sum = c * 100
    if sum > max_prize:
        max_prize = sum
print(max_prize)