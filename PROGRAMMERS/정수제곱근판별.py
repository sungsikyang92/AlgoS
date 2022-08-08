# n = 121
n = 3

def sol(n):
    answer= 0
    x = 1
    while True:
        srqt = x * x
        if srqt == n:
            answer = (x+1)*(x+1)
            break
        x += 1
        if srqt >= 50000000000000:
            return -1
    return answer


print(sol(n))
