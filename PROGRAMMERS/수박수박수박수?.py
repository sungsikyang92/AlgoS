n = 4

answer = ''
for i in range(n):
    if i % 2 == 0:
        answer += '수'
    elif i % 2 != 0:
        answer += '박'

print(answer)

s = "수박"*int((n**0.5)+1)
print(s)
print(s[:n])