n = int(input())
list = []
for x in range(n):
    tmp = input()
    list.append(tmp)

for x in list:
    cnt = 0
    sum = 0
    for i in x:
        if i == 'O':
            cnt += 1
            sum += cnt
        else:
            cnt = 0
    print(sum)

