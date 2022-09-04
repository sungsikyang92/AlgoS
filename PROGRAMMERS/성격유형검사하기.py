survey = ["AN", "CF", "MJ", "RT", "NA"]
choices = [5, 3, 2, 7, 5]
# 1 - 7
def solution(survey, choices):
    answer = ''
    record = {}
    for x, y in zip(survey, choices):
        print(x,y)
        # if y == 1:
        #     record[x[0]] = 3
        #     record[x[1]] = 0
        # elif y == 2:
        #     record[x[0]] = 2
        #     record[x[1]] = 0
        # elif y == 3:
        #     record[x[0]] = 1
        #     record[x[1]] = 0
        # elif y == 4:
        #     record[x[0]] = 0
        #     record[x[1]] = 0
        # elif y == 5:
        #     record[x] = 6
        #     record[x[1]] = 1
        # elif y == 6:
        #     record[x[0]] = 0
        #     record[x[1]] = 2
        # elif y == 7:
        #     record[x[0]] = 0
        #     record[x[1]] = 3
    print(record)
    return answer

print(solution(survey, choices))