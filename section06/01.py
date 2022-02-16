# 재귀함수를 이용한 이진수 출력

n = int(input())

result = 0
cnt = 0
def make_binary_num(n):
    global result
    global cnt
    result += (n % 2) * (10 ** cnt)
    cnt += 1
    if n > 1:
        make_binary_num(n // 2)
    else:
        # result += (n % 2) * (10 ** cnt)
        # cnt += 1
        result += (n // 2) * (10 ** cnt)
    return result

print(make_binary_num(n))

# def make_binary_num(n):
#     if n == 0:
#         return
#     else:
#         make_binary_num(n // 2)
#         print(n % 2, end = ' ')
# make_binary_num(n)