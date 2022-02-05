# 회의실 배정(그리디)

# n = int(input())
# a_time = []
# for _ in range(n):
#     a_time.append(list(map(int, input().split())))
n = 5
a_time = [[1, 4], [2, 3], [3, 5], [4, 6], [5, 7]]
print(a_time)
a_time.sort()
print("그냥 sorting >>", a_time)
a_time.sort(key = lambda x:x[1]) #람다 함수 사용으로, key값 을 x로 잡고
print("뒷자리로 sorting >>", a_time)
a_time.sort(key = lambda x:x[0])
print("앞자리 sortring >>", a_time)
end_time = 0
result = 0
for j in range(2):
    cnt_time_list = []
    for i in range(n):
        if a_time[i][1] >= a_time[1][i]:
            end_time = a_time[1][i]
            cnt_time_list.append(a_time[i])
            print(a_time[i])
            print("next loop")
        else:
            continue
    if result <= len(cnt_time_list):
        result = len(cnt_time_list)
print(result)

# a[0] >> a[1] ~ a[end]
# a[1] >> a[2] ~ a[end]
# a[2] >> a[3] ~ a[end]
# a[0][1] == a[1][0]