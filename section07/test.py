# 깊이는 숫자열만큼
# 더 재귀가 불가능하면
#   카운트 append
#   print("".join(output))
# 숫자 하나만 문자로 바꿔서 append(output) 후 재귀
# 숫자 두개 값이 26보다 작거나 같으면
#   두개 문자로 바꿔서 append(output) 후 재귀
a_minus1 = 96
crip = input()

output = []
outputlist = []
def dfs(c):
    if not c:
        outputlist.append("".join(output))
        return
    output.append(chr(a_minus1 + int(c[0])))
    dfs(c[1:])
    output.pop()
    if 10 <= int(c[:2]) <= 26:
        output.append(chr(a_minus1 + int(c[:2])))
        dfs(c[2:])
        output.pop()
dfs(crip)
print(*outputlist)
print(len(outputlist))
# opl = []
# for v in outputlist:
#     if v not in opl:
#         opl.append(v)
#         print(v)
# print(len(opl))