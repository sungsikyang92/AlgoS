n = 5
fibo = []
for x in range(n+1):
    if x == 0:
        fibo.append(x)
    elif x == 1:
        fibo.append(x)
    else:
        fibo.append(fibo[x-1] + fibo[x-2])
print(fibo)
print(fibo[-1] % 1234567)