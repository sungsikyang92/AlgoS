n = input()
num = n
cnt = 0
while True:
    if len(n) == 1:
        num = "0" + num
    num = int(num[0]) + int(num[1])
    num = str(num)
    num =