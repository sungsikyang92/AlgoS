# strings = ["sun", "bed", "car"]
strings = ["abce", "abcd", "cdx"]
n = 1

def sol(strings, n):
    answer = []
    answer = sorted(strings, key = lambda x:(x[n],x))
    return answer


print(sol(strings,n))