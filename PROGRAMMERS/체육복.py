n = 5
lost = [2, 4]
reserve = [1,3,5]

def solution(n,lost,reserve):
    inclass = n - len(lost)
    return inclass

print(solution(n,lost,reserve))







# # 방법 2
def solution2(n, lost, reserve):
    s= set(lost) & set(reserve) #두 집합의 교집합을 s에 담는다.
    l = set(lost) - s # 체육복을 빌려야 하는 학생들
    r = set(reserve) - s # 체육복을 빌려 줄 수 있는 학생들
    for x in sorted(r):
        if x - 1 in l:
            l.remove(x - 1)
        elif x + 1 in l:
            l.remove(x + 1)
    return n - len(l)
#
print(solution2(n,lost,reserve))
#
# # 방법1
# def solution(n, lost, reserve):
#     u = [1] * (n + 1) # 1번과 n번 뒤에도 1을 한개씩 넣어주기에 +2를 해준다.
#     for i in reserve:
#         u[i] += 1 #체육복 가져온 친구들 +1 씩 한다.
#     for i in lost:
#         u[i] -= 1 #체육복을 가져오지 않은 친구들은 -1 씩 하여서, 0 이 된다.
#     for i in range(1, n + 1):
#         if u[i - 1] == 0 and u[i] == 2:
#             # u[i] -= 1
#             # u[i - 1] += 1
#             u[i - 1:i + 1] = [1, 1]
#         elif u[i] == 2 and u[i + 1] == 0:
#             u[i:i + 2] = [1, 1]
#     return len([x for x in u[1:-1] if x > 0])