# 점수계산

n = int(input())
chk = list(map(int, input().split()))
score = 0
result = 0
for i in range(n):
    if chk[i] == 1:
        score += 1
        result += score
    else:
        score = 0
print(result)