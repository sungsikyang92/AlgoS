s1= [1,2,3]
n1= ["james", "bob", "alice"]
s2= [10,20,30]
n2= ["james", "alice", "bob"]
s3= [1000,1,1]
n3= ["bob", "alice", "james"]


for s,n in zip(s1, n1):
    print(s,n)

def solution(s1,s2,s3,n1,n2,n3):
    answer = []
    d1 = list(zip(s1,n1))
    d2 = list(zip(s2,n3))
    d3 = list(zip(s3,n3))
    print(d1)
    print(d2)
    print(d3)

    return answer


print(solution(s1,s2, s3, n1, n2, n3))