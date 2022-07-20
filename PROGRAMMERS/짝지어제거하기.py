from collections import deque

# s = "baabaa"
s = "cdcd"

def solution(s):
    answer = -1
    words = deque(s)
    stk = []
    while words:
        stk.append(words.popleft())
        if len(stk) > 1:
            if stk[-1] == stk[-2]:
                stk.pop()
                stk.pop()
    if len(stk) == 0:
        answer = 1
    else:
        answer = 0


    return answer


print(solution(s))
