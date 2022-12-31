import re
# dartResult = "1S2D*3T"
# dartResult = "1D2S#10S"
# dartResult = "1D2S0T"
# dartResult = "1S*2T*3S"
# dartResult = "1D#2S*3S"
# dartResult = "1T2D3D#"
# dartResult = "1D2S3T*"
dartResult = "10D4S10D"
arr = [""] * 10
print(arr)
round = 0
result = [''] * 10

for i in dartResult:
    if i.isnumeric():
        round += 1
    arr[round] += i
print(arr)
for i in range(len(arr)):
    if len(arr[i]) == 1 and arr[i].isnumeric():
        arr[i] += arr[i+1]
        arr[i+1]=''
print(arr)


# t = "10S"
# dartResult = "1D2S#10S"
# sp = re.findall('\d+', t)
# sp2 = re.findall('\d+', dartResult)
# print(sp)
# print(sp2)

for i in range(1, len(arr)):
    for j in arr[i]:
        if j.isnumeric():
            # tmp = re.findall('\d+', arr[i])
            # if tmp == 10:
            #     result[i] = int(tmp[0])
            # else:
            #     result[i] = int(tmp[0])
            result[i] += j
        elif j == 'S':
            result[i] = int(result[i]) ** 1
        elif j == 'D':
            result[i] = int(result[i]) ** 2
        elif j == 'T':
            result[i] = int(result[i]) ** 3
        elif j == '*':
            if i == 1:
                result[i] = int(result[i]) * 2
            else:
                result[i] = int(result[i]) * 2
                result[i - 1] = int(result[i - 1]) * 2
        elif j == '#':
            result[i] = int(result[i]) * -1
        print(result)
print(result)
for i in range(len(result)):
    if result[i] == '':
        result[i] = 0
print(result)
print(sum(result))

# ###################################3
def solution(dartResult):
    n = ''
    score = []
    for i in dartResult:
        if i.isnumeric():
            n += i
        elif i == 'S':
            n = int(n) ** 1
            score.append(n)
            n = ''
        elif i == 'D':
            n = int(n) ** 2
            score.append(n)
            n = ''
        elif i == 'T':
            n = int(n) ** 3
            score.append(n)
            n = ''
        elif i == '*':
            if len(score) > 1:
                score[-2] = score[-2] * 2
                score[-1] = score[-1] * 2
            else:
                score[-1] = score[-1] * 2
        elif i == '#':
            score[-1] = score[-1] * -1
        print(score)
    return sum(score)

print(solution(dartResult))