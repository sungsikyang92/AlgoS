n = 10
# n = 12


def solution(n):
    answer = 0
    min = 1000000
    for x in range(1, n):
        tmp = n % x
        if tmp == 1 and x < min:
            min = x
    answer = min
    return answer

print(solution(n))