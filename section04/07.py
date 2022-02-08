# 창고 정리

l = int(input())
box_height = list(map(int, input().split()))
# print(box_height)
m = int(input())
box_height.sort(reverse=True)
# print(box_height)
for _ in range(m):
    box_height[0] -= 1
    box_height[-1] += 1
    box_height.sort(reverse=True)
#     print(box_height)
# print(box_height)
print(max(box_height) - min(box_height))