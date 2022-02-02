a = [[1,2,3,4,5], [6,7,8,9,10]]
print(a)
print(a[0].pop(0))

# 곳감(모래시계)
n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
print("original >>", arr)
m = int(input())
for _ in range(m):
    cmd = list(map(int, input().split()))
    r_num, direction, rpt = cmd[0] - 1, cmd[1], cmd[2]
    print(arr[r_num])
    if direction == 0:
        for _ in range(rpt):
            arr[r_num].append(arr[r_num].pop(0))
            print(arr)
    else:
        for _ in range(rpt):
            arr[r_num].append()
    print("result >>", arr)