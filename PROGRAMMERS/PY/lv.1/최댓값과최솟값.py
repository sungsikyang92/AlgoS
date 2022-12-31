# s = "1 2 3 4"
s = "-1 -2 -3 -4"
# s = "-1 -1"

def solution(s):
    answer = ''
    s_list = list(map(int, s.split(' ')))
    s_list.sort()
    answer += str(s_list[0])
    answer += " "
    answer += str(s_list[-1])
    return answer

print(solution(s))