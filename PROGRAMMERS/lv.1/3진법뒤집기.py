# n진수 -> 10진수
# print(int('101',2))
# print(int('202',3))
# print(int('303',4))
# print(int('404',5))
# print(int('505',6))
# print(int('ACF',16))

# 10진수 -> 2,8,16진수
# print(bin(11))
# print(oct(11))
# print(hex(11))

# 10진수 -> n진수
# def solution(n, q):
#     rev_base = ''
#     while n>0:
#         n, mod = divmod(n,q)
#         rev_base += str(mod)
#
#     return rev_base[::-1]
#
# print(solution(45, 3))

def solution(n, q):
    rev_base = ''
    while n > 0:
        n, mod = divmod(n,q)
        rev_base += str(mod)
    print(int(rev_base,3))
    return rev_base

print(solution(45,3))

