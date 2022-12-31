# t = "3141592"
# p = "271"
t = "500220839878"
p = "7"
cnt = 0
for i in range(len(p),len(t) + 1):
    if t[i-len(p):i] <= p:
        cnt += 1
print(cnt)