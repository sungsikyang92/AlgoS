a = 5
b = 3
answer = 0

if a == b:
    answer = 3
if a > b:
    a, b = b, a
for i in range(a, b+1):
    answer += i
print(answer)