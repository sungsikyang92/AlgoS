tasks = [1,1,2,3,3,2,2,2,2,2,2]
# tasks = [4,1,1,1,1,2,3]
def solutions(tasks):
    answer = 0
    tasks.sort()
    stk = [0] * (max(tasks) + 1)
    for i in tasks:
        stk[i] += 1
    print(stk)
    for i in stk:
        if i == 0:
            continue
        if i == 1:
            answer = -1
            break
        elif i >= 4:
            if i % 3 == 0:
                answer += i // 3
            elif i % 2 == 0:
                answer += i // 2
        else:
            answer += 1
    return answer

print(solutions(tasks))