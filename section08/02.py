# 네트워크 선 자르기(Top_Down) 하향식



def cutting_method(n):
    if n == 1 or n == 2:
        return n
    if dp[n] != 0:
        return dp[n]
    dp[n] = cutting_method(n - 1) + cutting_method(n - 2)
    return dp[n]



n = int(input())
dp = [0] * (n + 1)
print(cutting_method(n))
