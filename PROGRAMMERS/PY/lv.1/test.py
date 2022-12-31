x = 11
def solution(x):
    answer = True
    x = str(x)
    tmp = 0
    for i in x:
        tmp += int(i)
    x = int(x)
    if x % tmp != 0:
        answer = False
    return answer

print(solution(x))