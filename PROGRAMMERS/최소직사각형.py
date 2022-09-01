# sizes = [[60, 50], [30, 70], [60, 30], [80, 40]]
sizes = [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]
def solution(sizes):
    answer = 0

    tmp = sorted(sizes, key = lambda x : (-x[0], x[1]))
    print(tmp)
    print(tmp[0])
    print(tmp[-1][0])
    print(tmp[-1][1])
    tmp_1 = tmp[-1][0]
    tmp[-1][0] = tmp[-1][1]
    tmp[-1][1] = tmp_1
    tmp_2 = sorted(tmp, key=lambda x: (-x[0], x[1]))
    # print(tmp_2)
    answer = tmp_2[0][0] * tmp_2[-1][1]
    return answer

print(solution(sizes))