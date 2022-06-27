t = int(input())

for x in range(1,t+1):
    a,b=map(int,input().split())
    print("Case #{0}: {1} + {2} =".format(x, a, b), a+b)