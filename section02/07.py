#소수(에라토스테네스 체)
n = int(input())

prime_count = 0
for i in range(2, n + 1):
    p = 0
    for j in range(1, int(i ** 0.5) + 1):
        if i % j == 0:
            p += 1
    if p == 1:
        prime_count += 1
print(prime_count)