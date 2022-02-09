from collections import deque
N = int(input())
a = list(map(int, input().split()))
a = deque(a)
res = ""
temp = 0
cnt = 0
while a:
    # print("CHECK")
    if (a[0] >= temp and a[-1] >= temp):
        if (a[0] >= a[-1]):
            temp = a.pop()
            res = res + "R"
            cnt += 1
        else:
            temp = a.popleft()
            res = res + "L"
            cnt += 1
    elif (a[0] >= temp):
        temp = a.popleft()
        res = res + "L"
        cnt += 1
    elif (a[-1] >= temp):
        temp = a.pop()
        res = res + "R"
        cnt += 1
    else:
        break
print(cnt)
print(res)

