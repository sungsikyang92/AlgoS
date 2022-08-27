import re
t = "10S"
dartResult = "1D2S#10S"
sp = re.findall('\d+', t)
sp2 = re.findall('\d+', dartResult)
print(sp)
print(sp2)