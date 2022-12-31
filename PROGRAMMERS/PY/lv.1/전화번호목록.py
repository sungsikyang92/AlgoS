phone_book = ["119", "97674223", "1195524421"]
# phone_book = ["123","456","789"]
# phone_book = ["12","123","1235","567","88"]

def solution(phone_book):
    answer = True
    phone_book.sort()
    print(phone_book)
    for x in range(len(phone_book)):
        if phone_book[x].startswith(phone_book[x-1]):
            answer = False
    return answer



print(solution(phone_book))
