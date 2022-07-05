s = input()
arr = [-1] * 26

for i in range(len(s)):
    arr[ord(s[i])-97] = s.index(s[i])
for i in arr:
    print(i, end=" ")