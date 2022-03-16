# 숫자만 추출
words = input()
num = ''
for i in words:
    if i.isdigit():
        num += i
num = int(num)
print(num)
cnt = 0
for i in range(1, num + 1):
    if num % i == 0:
        cnt += 1
print(cnt)