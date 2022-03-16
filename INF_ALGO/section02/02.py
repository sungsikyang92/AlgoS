T = int(input())

for i in range(1, T + 1):
    N, s, e, k = map(int, input().split())
    N_list = list(map(int, input().split()))
    new_list = []
    for j in range(s - 1, e):
        new_list.append(N_list[j])
    print(new_list)
    new_list.sort()
    print(new_list)
    print('#', end='')
    print(i, end=' ')
    print(new_list[k - 1])