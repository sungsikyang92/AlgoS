def solution(s):
    answer = ''
    cnt = 0
    for i in s:
        if i != " ":
            if cnt % 2 == 0:
                cnt += 1
                answer += i.capitalize()
            else:
                cnt += 1
                answer += i.lower()
        else:
            answer += i
            cnt = 0

    return answer