n = 118372

def sol(n):
    answer= ''
    n = str(n)
    n = list(n)
    n.sort(reverse=True)
    for i in n:
        answer += i
    return int(answer)

print(sol(n))