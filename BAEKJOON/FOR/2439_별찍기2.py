n = int(input())

for x in range(n, 0,-1):
    print(" "*(x-1), end='')
    print("*"*(n-x+1))