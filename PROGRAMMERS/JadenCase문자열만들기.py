# s = "3people unFollowed me"
s = "for the last week"

def solution(s):
    answer = ''
    sl2 = s.split(" ")
    for i in range(len(sl2)):
        sl2[i] = sl2[i].capitalize()
    answer = ' '.join(sl2)
    return answer
print(solution(s))