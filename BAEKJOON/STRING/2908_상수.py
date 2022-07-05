nums = input()
nums = nums[::-1]

AB = nums.split()
if int(AB[0]) > int(AB[1]):
    print(AB[0])
else:
    print(AB[1])