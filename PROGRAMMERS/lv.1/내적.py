a = [1,2,3,4]
b = [-3,-1,0,2]
result = 0
for i,j in zip(a,b):
    result += (i*j)
print(result)