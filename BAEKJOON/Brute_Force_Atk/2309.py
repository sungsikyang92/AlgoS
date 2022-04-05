# 일곱 난쟁이
import sys
n = []
for i in range(9):
    n.append(int(input()))
n.sort()
for i in range(9):
    for j in range(i + 1, 9):
        if sum(n) - n[i] - n[j] == 100:
            for k in range(9):
                if i == k or j == k:
                    continue
                print(n[k])
            sys.exit(0)