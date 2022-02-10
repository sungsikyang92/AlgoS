# Anagram(아나그램 : 구글 인터뷰 문제)

a = input()
b = input()
a = list(a)
b = list(b)
a.sort()
b.sort()
# print(a)
# print(b)
if a == b:
    print("YES")
else:
    print("NO")