N = int(input())
m_score = list(map(int, input().split()))
n_sum = sum(m_score)
#round사용, 그냥 쓰면 소숫점 첫째자리에서 반올림 그러나 인덱스자리를 사용해주면 해당 위치에서 반올림. ex) round(123.4554, 2) 소수점 셋째자리까지 반올림 123.46. ex) round(2134, -1) 첫째자리에서 반올림 2330
avg = round(n_sum / N)
min = float('inf')
for idx, i in enumerate(m_score):
    tmp = abs(i - avg)
    if tmp < min:
        min = tmp
        result_score = i
        result = idx + 1
    elif tmp == min:
        if i > result_score:
            result_score = i
            result = idx + 1
print(avg, result)