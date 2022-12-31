# n = 5
n = 6
# arr1 = [9, 20, 28, 18, 11]
arr1 = [46, 33, 33 ,22, 31, 50]
# arr2 = [30, 1, 21, 17, 28]
arr2 = [27 ,56, 19, 14, 14, 10]
def solution(n, arr1, arr2):
    answer = []
    for i,j in zip(arr1,arr2):
        tmp = str(bin(i|j)[2:])
        tmp = tmp.rjust(n,'0')
        tmp = tmp.replace('1','#')
        tmp = tmp.replace('0',' ')
        answer.append(tmp)

    return answer

print(solution(n,arr1,arr2))