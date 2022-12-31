def solution(answers):
    a = [1, 2, 3, 4, 5]
    b = [2, 1, 2, 3, 2, 4, 2, 5]
    c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    cnt = [0,0,0]
    for x in range(len(answers)):
        if answers[x] == a[x]:
            cnt[0] += 1
        if answers[x] == b[x]:
            cnt[1] += 1
        if answers[x] == c[x]:
            cnt[2] += 1
    tmp = max(cnt)
    result = cnt.index(tmp)
    return result

# 1번 수포자 1,2,3,4,5 / 1,2,3,4,5
# 2번 수포자 2,1,2,3,2,4,2,5 / 2,1,2,3,2,4,2,5
# 3번 수포자 3,3,1,1,2,2,4,4,5,5 / 3,3,1,1,2,2,4,4,5,5

answers = [1,2,3,4,5]

print(solution(answers))

