# 공주구하기(큐 자료구조로 해결)
# 큐는.. FIFO
n, k = map(int, input().split())
que = [i for i in range(1, n + 1)]
while n > 1:
    for i in range(k - 1):
        # print(que[0])
        que.append(que.pop(0))
    que.pop(0)
    if len(que) == 1:
        print(que[0])
        break