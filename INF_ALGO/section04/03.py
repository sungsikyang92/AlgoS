# 뮤직비디오(결정알고리즘)
n, m = map(int, input().split())
r_time = list(map(int, input().split()))

def dvd_Count(r_time, mid_time):
    cnt = 1
    sum = 0
    for i in r_time:
        if sum + i > mid_time:
            cnt += 1
            sum = i
        else:
            sum += i
    return cnt

def dvd_Min_Storage(r_time, m):
    min_time = 1
    max_time = sum(r_time)
    result = 0
    while min_time <= max_time:
        mid_time = (min_time + max_time) // 2
        if dvd_Count(r_time, mid_time) <= m:
            result = mid_time
            max_time = mid_time - 1
        else:
            min_time = mid_time + 1
    return result

print(dvd_Min_Storage(r_time, m))