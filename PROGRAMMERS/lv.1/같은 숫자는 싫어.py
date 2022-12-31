arr = [1,1,3,3,0,1,1]
stk = []
stk.append(arr[0])
for i in range(1, len(arr)):
    if arr[i-1] != arr[i]:
        stk.append(arr[i])
print(stk)


# def no_continuous(s):
#     a = []
#     for i in s:
#         if a[-1:] == [i]: continue
#         a.append(i)
#     return a
#
# # 아래는 테스트로 출력해 보기 위한 코드입니다.
# print( no_continuous( "133303" ))
