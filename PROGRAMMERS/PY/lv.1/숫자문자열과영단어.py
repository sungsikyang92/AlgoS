words = ["zero","one","two","three","four","five","six","seven","eight","nine"]

stk = []
# s = "one4seveneight"
# s = "23four5six7"
# s = "2three45sixseven"
s = "123"
word =""
result = ""
for i in s:
    if i.isalpha():
        word += i
        if word in words:
            result += str(words.index(word))
            word=""
    else:
        result += i
print(result)

# num_dic = {"zero":"0", "one":"1", "two":"2", "three":"3", "four":"4", "five":"5", "six":"6", "seven":"7", "eight":"8", "nine":"9"}
#
# def solution(s):
#     answer = s
#     for key, value in num_dic.items():
#         answer = answer.replace(key, value)
#     return int(answer)