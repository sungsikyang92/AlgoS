# 사과나무(다이아몬드)

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
result = 0
r_ptr = l_ptr = n // 2
for i in range(n):
    for j in range(r_ptr, l_ptr + 1):
        result += arr[i][j]
    if i < n // 2:
        r_ptr -= 1
        l_ptr += 1
    else:
        r_ptr += 1
        l_ptr -= 1
print(result)