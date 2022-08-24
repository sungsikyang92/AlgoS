t = "1+2+3"

print(t)
tmp = 0
for i in t:
    if i.isnumeric():
        tmp += int(i)
    else:
        tmp += i

print(tmp)