a = 5
b = 24

arr = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

day = ["FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"]
answer = 0
def sol(a, b):
    answer = 0
    for i in range(1, a):
        answer += arr[i]

    answer += b - 1
    answer %= 7
    return day[answer]

print(sol(a, b))