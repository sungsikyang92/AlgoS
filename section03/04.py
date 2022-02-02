# 두 리스트 합치기
n = int(input())
n_list = list(map(int, input().split()))
m = int(input())
m_list = list(map(int, input().split()))
# print(n_list)
# print(m_list)
s_list = []
# print(s_list)
s_list = n_list + m_list
s_list.sort()
print(s_list)