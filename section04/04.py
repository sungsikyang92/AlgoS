# 마구간 정하기(결정알고리즘)

n, c = map(int, input().split())
r_coord = []
for _ in range(n):
    r_coord.append(int(input()))
# print(r_coord)
r_coord.sort()

def cal_Dist(m_dis, r_coord):
    cnt = 1
    loc = r_coord[0]
    for i in range(1, n):
        if r_coord[i] - loc >= m_dis:
            cnt += 1
            loc = r_coord[i]
    return cnt

def get_Dist(r_coord, c):
    result = 0
    s_dis = 1
    e_dis = r_coord[-1]
    while s_dis <= e_dis:
        m_dis = (s_dis + e_dis) // 2
        if cal_Dist(m_dis, r_coord) >= c:
            result = m_dis
            s_dis = m_dis + 1
        else:
            e_dis = m_dis - 1
    return result
print(get_Dist(r_coord, c))