# board = [[0,0,0,0,0],
#          [0,0,1,0,3],
#          [0,2,5,0,1],
#          [4,2,4,4,2],
#          [3,5,1,3,1]]
#
# moves = [1,5,3,5,1,2,1,4]
#
# def solution(board, moves):
#     stack = []
#     count = 0
#
#
#     return none

# board 반복문 실행시켜서 0~4까지. 두번째자리 확인하여 stack=[]에 append한다. 그리고 같은 숫자가 만나면 pop한다.

from collections import deque

board = [[0,0,0,0,0],
         [0,0,1,0,3],
         [0,2,5,0,1],
         [4,2,4,4,2],
         [3,5,1,3,1]]

moves = [1,5,3,5,1,2,1,4]
d_moves = deque(moves)
stack = []
count = 0

for m in d_moves:
    for x in range(len(board)):
        if board[x][m-1] > 0:
            stack.append(board[x][m-1])
            board[x][m-1] = 0
            if stack[-1:] == stack[-2:-1]:
                count += 2
                stack.pop()
                stack.pop()
            #     같으나 조금 다른 방법
            # if len(stack) > 1:
            #     if stack[-1] == stack[-2]:
            #         count += 2
            #         stack.pop()
            #         stack.pop()
            break
print(count)