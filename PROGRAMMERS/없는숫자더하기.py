zero_nine = [1,2,3,4,5,6,7,8,9,0]

numbers = [1,2,3,4,6,7,8,0]

for i in range(len(zero_nine)):
    if zero_nine[i] in numbers:
        zero_nine[i] = 0
print(sum(zero_nine))


