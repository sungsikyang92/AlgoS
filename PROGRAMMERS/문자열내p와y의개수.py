# s = "pPoooyY"
s = "Pyy"

s = s.upper()
print(s)
cnt = 0
for i in s:
    if i == 'P':
        cnt += 1
    elif i == 'Y':
        cnt -= 1

if cnt == 0:
    answer = True
else:
    answer = False

print(cnt)