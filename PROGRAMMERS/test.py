name = "JEROEN"

def solution(name):
    answer = 0
    n_len = len(name)
    A_list = ['A' for i in range(n_len)]
    cnt = 0
    while A_list:
        u_cnt = 65
        d_cnt = 90
        l_cnt = 0
        r_cnt = n_len - 1
        for x in range(n_len):
            if A_list[x] == 'A':
                continue
            else:





    return answer


print(solution(name))

