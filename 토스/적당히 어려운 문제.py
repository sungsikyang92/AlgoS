# levels = [1, 2, 3, 4]
levels = [1, 2, 3, 4, 5, 6, 7, 8, 9]

def solution(levels):
    answer = 0
    p = round(len(levels)*0.75)
    percent = len(levels)*0.75
    if p-percent>=0.5:
        answer = levels[int(percent)]
    else:
        answer = levels[p]
    return answer

print(solution(levels))