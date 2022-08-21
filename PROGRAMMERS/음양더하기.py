absolutes = [4,7,12]
# absolutes = [1,2,3]
signs = ["true","false","true"]
# signs = ["false","false","true"]
result = 0
for i,j in zip(absolutes,signs):
    if j == "true":
        result += i
    elif j == "false":
        result -= i

print(result)