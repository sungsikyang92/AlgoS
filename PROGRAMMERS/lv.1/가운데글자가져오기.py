s = "qwer"
answer = ''
if len(s) % 2 != 0:
    answer = s[int(len(s)//2)]
else:
    answer = s[int(len(s)//2)-1:int(len(s)//2)+1]

print(answer)