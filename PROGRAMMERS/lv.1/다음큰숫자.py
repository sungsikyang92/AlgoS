n = 78
n_one_count = bin(n)[2:].count('1')
print(n_one_count)
for x in range(n + 1, 1000000):
    if bin(x)[2:].count('1') == n_one_count:
        print(x)
        break