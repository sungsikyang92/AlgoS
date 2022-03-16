# 회문 문자열 검사
n = int(input())
for k in range(1, n + 1):
    words = input()
    words = words.upper()
    if words == words[::-1]:
        print("#%d YES" %k)
    else:
        print("#%d NO" %k)