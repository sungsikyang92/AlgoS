numbers = [2,1,3,4,1]
# numbers = [5,0,2,7]
result = []
num = 0
for i in range(num, len(numbers)):
    for j in range(num+1, len(numbers)):
        tmp = 0
        tmp = numbers[i] + numbers[j]
        result.append(tmp)
    num += 1

print(result)
result.sort()
print(set(result))

# def solution(numbers):
#     answer = []
#     for i in range(len(numbers)):
#         for j in range(i+1, len(numbers)):
#             answer.append(numbers[i] + numbers[j])
#     return sorted(list(set(answer)))