#뒤집은 소수

n = int(input())
n_list = list(map(str, input().split()))

def reverse(x_list):
    for i in range(n):
        x_list[i] = int(x_list[i][::-1])
    return(x_list)

# print("reverse working good >>", reverse(n_list))
def isPrime(x_list):
    reverse(x_list)
    # return x_list
    prime_list = []
    for i in x_list:
        p = 0
        for j in range(1, i + 1):
            if i % j == 0:
                p += 1
        if p == 2:
            prime_list.append(i)
    return(prime_list)
print(*isPrime(n_list))