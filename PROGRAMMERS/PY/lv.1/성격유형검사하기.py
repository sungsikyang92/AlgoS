# survey = ["AN", "CF", "MJ", "RT", "NA"]
# choices = [5, 3, 2, 7, 5]
survey = ["TR", "RT", "TR"]
choices = [7, 1, 3]
# 1 - 7
def solution(survey, choices):
    answer = ''
    record = {'A':0, 'N':0, 'C':0, 'F':0, 'M':0, 'J':0, 'R':0, 'T':0}
    for x, y in zip(survey, choices):
        # print(x,y)
        if y == 1:
            record[x[0]] += 3
            record[x[1]] += 0
        elif y == 2:
            record[x[0]] += 2
            record[x[1]] += 0
        elif y == 3:
            record[x[0]] += 1
            record[x[1]] += 0
        elif y == 4:
            record[x[0]] += 0
            record[x[1]] += 0
        elif y == 5:
            record[x[0]] += 0
            record[x[1]] += 1
        elif y == 6:
            record[x[0]] += 0
            record[x[1]] += 2
        elif y == 7:
            record[x[0]] += 0
            record[x[1]] += 3
    # print(record)
    category = ['RT','CF','JM','AN']
    for i in category:
        if record[i[0]] > record[i[1]]:
            answer += i[0]
        elif record[i[0]] < record[i[1]]:
            answer += i[1]
        else:
            if ord(i[0]) > ord(i[1]):
                answer += i[1]
            elif ord(i[0]) < ord(i[1]):
                answer += i[0]
    return answer

print(solution(survey, choices))
