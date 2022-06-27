import sys

input = sys.stdin.readline

T = int(input())

res = 0

for x in range(T):
    A, B = map(int, input().split())
    print(A+B)