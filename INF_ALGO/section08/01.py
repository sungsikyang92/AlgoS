# 네트워크 선 자르기(Bottom - up)
# bottom up 방식은 상향식이라고도 불리운다. 반복문으로 구현됨.

n = int(input())

cutting_way = [0] * (n + 1)

cutting_way[1] = 1
cutting_way[2] = 2

for i in range(3, n + 1):
    cutting_way[i] = cutting_way[i - 2] + cutting_way[i - 1]

print(cutting_way[n])