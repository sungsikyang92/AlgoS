
people = [9,4,4,4,5,3,2,1,3,6,3,4,5,1,1,3,5,6,7,5,4,3,2,4,5,6,1,2,3,4,5,6,2,4,1,3,5,10]
tshirts = [4,4,5,6,10]
cnt = 0
for i in people:
    if i in tshirts:
        tshirts.remove(i)
        cnt += 1
print(cnt)
