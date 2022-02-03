# 이분탐색
n, m = map(int, input().split())
n_list = list(map(int, input().split()))
# print(n_list)
n_list.sort()
# print(n_list)
def binary_search(n_list, n, m):
    l_ptr = 0
    r_ptr = n - 1
    while l_ptr <= r_ptr:
        m_ptr = (l_ptr + r_ptr) // 2
        if n_list[m_ptr] == m:
            return m_ptr + 1
        elif n_list[m_ptr] > m:
            r_ptr = m_ptr - 1
        else:
            l_ptr = m_ptr + 1

print(binary_search(n_list, n, m))