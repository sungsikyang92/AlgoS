n = 12345

def sol(n):
    answer=[]
    n = str(n)
    n = list(n)
    n = n[::-1]
    for i in range(len(n)):
        n[i] = int(n[i])
    answer = n
    return answer
print(sol(n))
