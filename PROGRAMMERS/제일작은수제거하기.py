arr=[4,3,2,1]
# arr=[10]

def sol(arr):
    answer=[]
    arr.pop(arr.index(min(arr)))
    if arr:
        answer = arr
    else:
        answer.append(-1)
    return answer

print(sol(arr))