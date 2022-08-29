price = 3
money = 20
count = 4

def sol(price, money, count):
    answer = 0
    tmp = 1
    while tmp < count + 1:
        answer += price * tmp
        tmp += 1
    if answer > money:
        return answer - money
    else:
        return 0


print(sol(price, money, count))