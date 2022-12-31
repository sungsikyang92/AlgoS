# n = 6
# n = 16
n = 626331

def solution(n):
    answer = 0
    while True:
        if n == 1:
            break
        elif n % 2 == 0:
            answer += 1
            n = n // 2
        elif n % 2 != 0:
            answer += 1
            n = (n * 3) + 1
        if answer >= 500:
            return -1
    return answer

print(solution(n))
