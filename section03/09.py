from collections import deque

# 봉우리
n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
arr = deque(arr)
# print("original >>", arr)   #arr 입력 확인
arr.appendleft([0] * n)
arr.append([0] * n)
for i in arr:
    # i = deque(i)
    # i.appendleft(0)
    # i.append(0)
    i.insert(0, 0)
    i.append(0)
# print(arr) #arr 외곽에 0 들어간거 확인
dx = [-1, 0, 1, 0]  #U, R, D, L의 순서이다.
dy = [0, 1, 0, -1]
cnt = 0
for i in range(1, n + 1):
    for j in range(1, n + 1):
        flag = 0
        for k in range(4):
            if arr[i + dx[k]][j + dy[k]] >= arr[i][j]:
                flag = 1
                break
        if flag == 0:
            cnt += 1
        # if all(arr[i][j] > arr[i + dx[k]][j + dy[k]] for k in range(4)):
        #     cnt += 1
        # all 함수를 사용, all함수는 인자로 받은 반복 가능한 자료형으 모든 요소가 True이면 True를 반환하는 함수
print(cnt)