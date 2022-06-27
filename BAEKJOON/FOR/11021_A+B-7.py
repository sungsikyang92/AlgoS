t = int(input())

for x in range(1,t+1):
    a, b = map(int, input().split())
    print("Case ", end='')
    print("#"+str(x)+":",end=' ')
    print(a+b)