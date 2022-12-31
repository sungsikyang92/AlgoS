n = 123
# n = 987

def sol(n):
    answer = 0
    n = str(n)
    for i in n:
        answer += int(i)
    return answer

print(sol(n))
