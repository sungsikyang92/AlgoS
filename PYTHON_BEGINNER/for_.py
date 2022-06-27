str='abcdef'
list = [1,2,3,4,5]
dict = {1:'a', 2:'b', 3:'c', 4:'d', 5:'e'}

for x in str:
    print(x)
print("**************")
for x in list:
    print(x)
print("**************")
print("values")
for x in dict:
    print(dict[x])
print("keys")
for x in dict:
    print(x)

print("**************")
for x in list:
    print(x)
    if x<3:
        continue
    else:
        break

print("**************")
for x in list:
    print(x)

else:
    print("done")
print("**************")

x = 0
while x < 10:
    x = x + 1
    if x < 3:
        continue
    print(x)
    if x> 7:
        break