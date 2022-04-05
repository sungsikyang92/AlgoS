# 골드바흐의 추측

MAX = 1000000
check = [0] * (MAX + 1)
check[0] = check[1] = True
prime = []
for i in range(2, MAX + 1):
    if not check[i]:
        prime.append(i)
        j = i + i
        while j <= MAX:
            check[j] = True
            j += i

prime = prime[1:]
while True:
    n = int(input())
    if n == 0:
        break
    for a in prime:
        if check[n - a] == False:
            print("{0} = {1} + {2}".format(n, a, n - a))
            break
