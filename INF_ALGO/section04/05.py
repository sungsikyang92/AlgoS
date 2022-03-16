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
cnt_time_list = []
for i in range(n):
    if a_time[i][0] >= end_time:
        end_time = a_time[i][1]
        cnt_time_list.append(a_time[i])
print(cnt_time_list)