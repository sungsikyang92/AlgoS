booked = [["09:10", "lee"]]
unbooked = [["09:00", "kim"], ["09:05", "bae"]]

# print(booked)
# for i in range(len(booked)):
#     booked[i][0] = booked[i][0].split(":")
#     booked[i][0] = [int(x) for x in booked[i][0]]
# print(booked[i][0])
# print(booked)
# print(booked[0][0])
# print("******************")

# test = booked[0][0].split(":")
# for i in test:
#     i = int(i)
# print(test, "1")
# test = [int(x) for x in test]
# print(test)
# test[1] = test[1] + 55
# print(test[0])
# print(test[1])
# if test[1] >= 60:
#     test[1] -= 60
#     test[0] += 1
# print(test)

# def solution(booked, unbooked):
#     answer = []
#     return answer
#
# print(solution(booked, unbooked))

custom = booked + unbooked
custom.sort()
print(custom)
for i in range(len(custom)):
    custom[i][0] = custom[i][0].replace(":", "")
    print(custom[i][0])
    custom[i][0] = int(custom[i][0])
    print(custom[i][0],"z")
    custom[i][0] = custom[i][0] + 10
    print(custom, "added")
    # if custom[i][0][2:4] >= 60:
print(custom)
print(custom[0][0][2:4])

a = ["1234"]
print(a[0][2:4])