# import sys
# input = sys.stdin.readline
# dice = list(map(int,input().split()))
# result = 0
# a=dice[0]
# b=dice[1]
# c=dice[2]
# if a == b == c:
#     result = 10000+(a*1000)
# elif a == b or b == c:
#     result = 1000+(b*100)
# elif c == a:
#     result = 1000*(a*100)
# else:
#     result = max(dice)*100
# print(result)
#
# dice.sort()
# print(dice)
# set_dice = set(dice)
# print(dice)
# res = 0
# if len(set_dice)==1:
#     res= 10000+(a*1000)
# elif len(set_dice)==2:
#     res=1000+(dice[1]*100)
# else:
#     res = max(dice)*100
# print(res)
import sys
input = sys.stdin.readline
dice = list(map(int, input().split()))
dice.sort()
# print(dice)
a = dice[0]
b = dice[1]
c = dice[2]
result = 0
if a == b == c:
    result = 10000+(a*1000)
elif a == b or b == c:
    result = 1000+(b*100)
elif c == a:
    result = 1000+(a*100)
elif a != b or b!=c or c!=a:
    result = max(dice)*100
print(result)