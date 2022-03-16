# 격자판 회문수

arr = [list(map(int, input().split())) for _ in range(7)]
# for j in range(7):
#     print(*arr[j])
def r_chk(arr):
    r_cnt = 0
    for i in range(7):
        for j in range(3):
            tmp = arr[i][j:j + 5]
            # print(tmp)
            if tmp == tmp[::-1]:
                r_cnt += 1
    return r_cnt

def c_chk(arr):
    c_cnt = 0
    for i in range(7):
        for j in range(3):
            for k in range(2):
                if arr[j+k][i] != arr[j + 5 - k - 1][i]:
                    # print("Front >>", arr[j+k][i])
                    # print("Back >>", arr[j + 5 - k - 1][i])
                    break
            else:
                c_cnt += 1
    return c_cnt
# print(r_chk(arr))
# print(c_chk(arr))
print(r_chk(arr) + c_chk(arr))