# from itertools import permutations
#
numbers = [6, 10, 2]
#
# a = list(permutations(numbers, len(numbers)))
#
# print(a)
# b = list(map(str, a))
# result = ""
# for i in b:
#     print(i)
# def solution(numbers):
    # 1
    # print(numbers, "int")
    # numbers = [str(x) for x in numbers]
    # print(numbers, "str")
    # numbers.sort(key = lambda x: (x * 4)[:4], reverse = True) # 1~4까지 반복 / 1000자 이하라고 했으니까
    # print(numbers, "sort")
    # # 0이 여러 개 있는 경우
    # if numbers[0] == '0':
    #     answer = '0'
    # else:
    #     answer = ''.join(numbers)
    # return answer
# print(solution(numbers))
# 2

# str_nums = [str(x) for x in numbers]
# str_nums.sort(key = lambda x : (x * 4)[:4], reverse=True)
