# s = "12223"
s = "111999333"
# s = "123"


def solution(s):
    tmp = []
    for i in range(2, len(s)):
        if s[i-1] == s[i-2]:
            if s[i] == s[i-1]:
                tmp.append(s[i])
    if tmp:
        return max(tmp)*3
    else:
        return -1

print(solution(s))