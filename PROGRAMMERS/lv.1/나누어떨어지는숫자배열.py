arr = [3,2,6]
divisor = 10
answer = []
for i in arr:
    if i % divisor == 0:
        answer.append(i)
if answer:
    answer.sort()
else:
    answer.append(-1)
print(answer)