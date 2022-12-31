# left = 13
left = 24
# right = 17
right = 27

def solution(left, right):
    answer = 0
    for x in range(left, right + 1):
        cnt = 0
        for j in range(1, x + 1):
            if x % j == 0:
                cnt += 1
        if cnt % 2 == 0:
            answer += x
        else:
            answer -= x
    return answer

print(solution(left,right))