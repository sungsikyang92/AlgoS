from collections import deque

n, m = map(int, input().split())
lst = list(map(int, input().split()))
lst = [(lst[i], i) for i in range(n)]
lst = deque(lst)
res = []

while True:
    print("S", lst[0][0])
    print("m", max(lst)[0])
    if lst[0][0] < max(lst)[0]:
        pt = lst.popleft()
        lst.append(pt)

    else:
        pt = lst.popleft()
        res.append(pt)
        print(res[-1][1])
        if res[-1][1] == m:
            break
print(len(res))