def solution(x, n):
    answer = []
    result = x
    for i in range(1, n + 1):
        answer.append(result)
        result += x
    return answer