N = int(input())
n_list = list(map(int, input().split()))

def digit_sum(x):
    sum_list = []
    for i in x:
        s_list = str(i)
        s_num = 0
        for j in s_list:
            num = int(j)
            s_num += num
        sum_list.append(s_num)
    max = -float('inf')
    for i in sum_list:
        if i > max:
            max = sum_list.index(i)
    return n_list[max]
print(digit_sum(n_list))