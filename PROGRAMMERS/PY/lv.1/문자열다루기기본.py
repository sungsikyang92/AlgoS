s = "a234"

for i in s:
    if i.isnumeric() and (len(s) == 4 or len(s) == 6):
        pass
    else:
        answer = False