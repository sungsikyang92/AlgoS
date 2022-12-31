# n = 3
n = 4

def sol(n):
    answer=''
    if n % 2 == 0:
        answer = "Even"
    else:
        answer = "Odd"
    return answer

print(sol(n))