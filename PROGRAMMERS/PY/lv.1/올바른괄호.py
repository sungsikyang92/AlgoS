def solution(s):
    answer = True
    stk = []

    for x in s:
        if x == "(":
            stk.append(x)
        else:
            if stk == []:
                answer = False
                break
            else:
                stk.pop()
    if stk != []:
        answer = False

    return answer


def solution(s):
    answer = True
    cnt = 0
    if s[0] == ")":
        return False
    if s[-1] == "(":
        return False
    else:
        for x in s:
            if x == "(":
                cnt += 1
            elif x == ")":
                cnt -= 1
                if cnt < 0:
                    return False

    if cnt != 0:
        answer = False
    return answer