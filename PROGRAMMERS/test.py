board = [[0,0,0,0,0],
         [0,0,1,0,3],
         [0,2,5,0,1],
         [4,2,4,4,2],
         [3,5,1,3,1]]

moves = [4]
stack = []
count = 0

# for m in moves:
#     for x in range(len(board)):
#         if board[x][m-1] > 0:
#             stack.append(board[x][m-1])
#             board[x][m-1] = 0
#             if stack[-1:] == stack[-2:-1]:
#                 count += 2
#                 stack.pop()
#                 stack.pop()
#             #     같으나 조금 다른 방법
#             # if len(stack) > 1:
#             #     if stack[-1] == stack[-2]:
#             #         count += 2
#             #         stack.pop()
#             #         stack.pop()
#             break
#
# print(count)

print(moves[-1:])
print(moves[-2:-1])

print(moves[-1])
print(moves[-2])
