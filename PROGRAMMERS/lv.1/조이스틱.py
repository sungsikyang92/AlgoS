name = "JEROEN"

def solution(name):
    n_len = len(name)
    A_list = ['A' for i in range(n_len)]
    cnt = 0
    for x in range(n_len):
        if ord(A_list[x]) != 65:
            u_cnt = 65
            d_cnt = 90
            cnt += min(ord(A_list[x]-u_cnt), d_cnt-ord(A_list[x]))
        else:
            l_cnt = 0
            r_cnt = n_len - 1
    return cnt


print(solution(name))

# print(ord('A'))
# print(ord('Z'))
# A = 65
# z = 90
# print(chr(65))