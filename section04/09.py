# 증가수열 만들기(그리디)

n = int(input())
n_list = list(map(int, input().split()))
result = ""
tmp = []
last = 0
l_ptr = 0
r_ptr = n - 1
# 처음 맨 앞자리
if n_list[0] < n_list[-1]:
    result += "L"
    tmp.append(n_list.pop(0))
elif n_list[0] > n_list[-1]:
    result += "R"
    tmp.append(n_list.pop())
print(n_list)
print(tmp)
# 두번째부터
while n > 1:
    if n_list[0] < n_list[-1]:
        if n_list[0] > tmp[-1]:
            tmp.append(n_list.pop(0))
            result += "L"
        else:
            pass
    if n_list[0] > n_list[-1]:
        if n_list[-1] > tmp[-1]:
            tmp.append(n_list.pop())
            result += "R"
        else:
            pass
    n -= 1
print(n_list)
print(tmp)


while l_ptr <= r_ptr:
    if n_list[l_ptr] > last:
        tmp.append((n_list[l_ptr], 'L'))
    if n_list[r_ptr] > last:
        tmp.append((n_list[r_ptr], 'R'))
    tmp.sort()
    if len(tmp) == 0:
        break
    else:
        result += tmp[0][1]
        last = tmp[0][0]
        if tmp[0][1] == 'L':
            l_ptr += 1
        else:
            r_ptr -= 1
    tmp.clear()

print(len(result))
print(result)