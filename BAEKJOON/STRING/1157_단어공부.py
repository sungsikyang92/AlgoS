words = input()
words = words.lower()
arr = [0]*26
for x in words:
    arr[ord(x)-97] += 1
max = -1
for x in arr:
    if x > max:
        max = x
cnt = 0
for x in arr:
    if x == max:
        cnt += 1
if cnt > 1:
    print("?")
else:
    print(chr(x.index(str(max))+97))