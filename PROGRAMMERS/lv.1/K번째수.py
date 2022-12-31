array = [1, 5, 2, 6, 3, 7, 4]
com = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]

def solution(array, com):
    answer = []
    for x in com:
        arr = array[x[0]-1:x[1]]
        arr.sort()
        answer.append(arr[x[2]-1])
    return answer

print(solution(array,com))