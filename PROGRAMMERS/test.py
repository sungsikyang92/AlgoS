a = [1, 2, 3, 4, 5] * 2000
b = [2, 1, 2, 3, 2, 4, 2, 5] * 1500
c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5] * 1000
# answers = [1,2,3,4,5]
answers = [1,3,2,4,2]
cnt = [0,0,0]
cnt_idx = [1,2,3]
result = []
for x in range(len(answers)):
    if answers[x] == a[x]:
        cnt[0]+=1
    if answers[x] == b[x]:
        cnt[1]+=1
    if answers[x] == c[x]:
        cnt[2]+=1

# cnt max값 cnt의 인덱스값이랑 같으면?
# 인덱스를 뽑아서 answers에 append

max_cnt = max(cnt)
for x in range(3):
    if cnt[x] == max_cnt:
        result.append(x + 1)
print(result)