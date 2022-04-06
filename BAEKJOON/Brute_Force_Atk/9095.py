# 1,2,3더하기

t = int(input())

for _ in range(t):
    result = 0
    n = int(input())
    for l1 in range(1, 4):
        if l1 == n:
            result += 1
        for l2 in range(1, 4):
            if l1 + l2 == n:
                result += 1
            for l3 in range(1, 4):
                if l1 + l2 + l3 == n:
                    result += 1
                for l4 in range(1, 4):
                    if l1 + l2 + l3 + l4 == n:
                        result += 1
                    for l5 in range(1, 4):
                        if l1 + l2 + l3 + l4 + l5 == n:
                            result += 1
                        for l6 in range(1, 4):
                            if l1 + l2 + l3 + l4 + l5 + l6 == n:
                                result += 1
                            for l7 in range(1, 4):
                                if l1+l2+l3+l4+l5+l6+l7 == n:
                                    result += 1
                                for l8 in range(1, 4):
                                    if l1+l2+l3+l4+l5+l6+l7+l8 == n:
                                        result += 1
                                    for l9 in range(1, 4):
                                        if l1+l2+l3+l4+l5+l6+l7+l8+l9 == n:
                                            result += 1
                                        for l10 in range(1, 4):
                                            if l1+l2+l3+l4+l5+l6+l7+l8+l9+l10 == n:
                                                result += 1
    print(result)