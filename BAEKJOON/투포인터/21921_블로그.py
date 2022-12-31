N, X = map(int, input().split())
visitors_number = list(map(int, input().split()))
if max(visitors_number) == 0:
    print("SAD")
else:
    ptr_a = 0
    ptr_b = X
    print(visitors_number[ptr_a:ptr_b])
