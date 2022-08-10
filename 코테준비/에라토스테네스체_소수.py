# n = 10
n = 5

sieve = [True] * (n + 1)
answer = 0
for i in range(2, int((n**0.5)+1)):
    if sieve[i] == True:
        for j in range(i+i, n+1, i):
            sieve[j] = False

for i in range(2, n+1):
    if sieve[i] == True:
        answer += 1

print(answer)