A = [1,2]
B = [3,4]
A.sort()
B.sort(reverse=True)
answer = 0
for x in range(len(A)):
    answer += A[x] * B[x]

print(answer)