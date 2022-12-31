# from itertools import permutations
#
number = "1924"
k = 2
#
# print(len(number))
#
# digit = len(number) - k
# print(digit)
# a =list(number)
# print(a)
# tmp = permutations(a, digit)
# tmp2 = [''.join(map(str, i)) for i in tmp]
# print(max(tmp2))

# stack = [1,2,3,4]
# stack = map(str, stack)
# print(''.join(stack))
#
# answer = []
# tmp = max(number[0:k])
# print(tmp)
#  강의 풀이법
# def solution(number, k):
#     result = []
#     for i, num in enumerate(number):
#         while len(result) > 0 and result[-1] < num and k > 0:
#             result.pop()
#             k -= 1
#         if k == 0:
#             result += list(number[i:])
#             break
#         result.append(num)
#
#     result = result[:-k] if k > 0 else result
#     answer = ''.join(result)
#     return answer
#
# print(solution(number,k))

def solution(number, k):
    cnt=0
    numb=int(number)
    num=[]
    while numb>0:
        num[cnt]=numb%10
        numb//10
        num+=num[cnt]
        cnt+=1
    num.sort(reverse=True)
    nu=str(num)
    n=0
    i=0
    while i<cnt-k:
        n+=nu[i]
        i+=1
    answer = n
    return answer

print(solution(number, k))