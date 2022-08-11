import re
# rl = ["card", "ace13", "ace16", "banker", "ace17", "ace14"]
# ni = "ace15"
rl = ["cow", "cow1", "cow2", "cow3", "cow4", "cow9", "cow8", "cow7", "cow6", "cow5"]
ni = "cow11"
# print(rl[2][:3])
rl.sort()
# s길이 6
s_length = re.findall('[a-z]',ni)
s_length = "".join(s_length)
# n 길이 6
n_length = re.findall(r'\d+',ni)
n_length = "".join(n_length)



def sol(rl, ni):
    answer=''
    S=''
    N=''
    rl.sort()
    if len(ni) < 3:
        return 'S의 길이가 3 미만입니다.'
    # elif ni.isupper() == 0:
    elif str(re.findall(r'[^a-z]', ni)).isupper():
        return 'S에 알파벳 소문자가 아닌 문자가 포함되어 있습니다.'
    elif ni[:3].isalpha() == 0:
        return 'S+N 형식이 아닙니다.(N+S형식은 허용하지 않습니다.)'
    elif ni[6:].isalpha():
        return 'S+N 형식이 아닙니다.(S+N+S 형식은 허용하지 않습니다.)'
    elif n_length.startswith('0'):
        return 'N의 첫자리가 "0"이 될 수 없습니다.'
    elif len(s_length) > 6:
        return 'S의 길이가 6을 초과합니다.'
    elif len(str(n_length)) > 6:
        return 'N의 길이가 6을 초과합니다.'

    if ni in rl:
        tmp = max(rl)
    for i in tmp:
        if i.isalpha():
            S+=i
        else:
            N+=i
    N = int(N) + 1
    answer = S+str(N)
    return answer

print(sol(rl,ni))