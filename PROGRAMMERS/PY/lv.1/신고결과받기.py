# id_list = ["muzi", "frodo", "apeach", "neo"]
# report = ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi", "muzi frodo"]
# k = 2
id_list = ["con", "ryan"]
report = ["ryan con", "ryan con", "ryan con", "ryan con"]
k = 3
def solution(id_list, report, k):
    answer = [0] * len(id_list)
    ticket_stk = []
    # report의 이용자id 신고한id를 split하여 신고한 id만 따로 ticket_stk에 append
    for x in set(report):
        a, b = x.split(" ")
        ticket_stk.append(b)
    # print(ticket_stk)
    ticket_id_list = {}
    # 신고당한 아이디의 숫자를 세어 ticket_id_list에 counting된 수를 dictionary형태로 입력
    for x in id_list:
        ticket_id_list[x] = ticket_stk.count(x)
    # print(ticket_id_list)
    reported = []
    for x in ticket_id_list.items():
        if x[1] >= k:
            reported.append(x[0])
    # print(reported)
    for x in set(report):
        a, b = x.split(" ")
        if b in reported:
            answer[id_list.index(a)] += 1
    return answer

print(solution(id_list, report, k))