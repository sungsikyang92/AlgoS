# 교육과정 설계

req = input()
# print(req)
n = int(input())
for i in range(n):
    sch = input()
    req_1 = list(req)
    for k in sch:
        if k in req_1:
            if k != req_1.pop(0):
                print("#%d NO" % (i + 1))
                break
    else:
        if len(req_1) == 0:
            print("#%d YES" %(i + 1))
        else:
            print("#%d NO" %(i + 1))