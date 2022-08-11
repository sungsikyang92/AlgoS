rl = ["cow", "cow1", "cow2", "cow3", "cow4", "cow9", "cow8", "cow7", "cow6", "cow5"]
ni = "cow"
S =''
N =''
if ni in rl:
    print(max(rl))
    tmp = max(rl)
print(tmp)
for i in tmp:
    if i.isalpha():
        S += i
    else:
        N += i
print(S)

N = int(N)+1
print(S+str(N))
