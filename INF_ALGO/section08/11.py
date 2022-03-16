# 최대점수 구하기(냅색 알고리즘)

n, m = map(int, input().split())
dy = [0] * (m + 1)
for i in range(n):
    score, time = map(int, input().split())
    for j in range(m, time - 1, -1):
        dy[j] = max(dy[j], dy[j - time] + score)

print(dy[m])