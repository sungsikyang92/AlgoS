
# s = "AB"
# n = 1
# s = "z"
# n = 1
s = "a B z"
n = 4
print(ord(' '))

answer = ''
for i in s:
    if i.isupper():
        answer += chr((ord(i) - ord('A') + n)%26+ord('A'))
    elif i.islower():
        answer += chr((ord(i) - ord('a') + n)%26+ord('a'))
    else:
        answer += ' '

print(answer)