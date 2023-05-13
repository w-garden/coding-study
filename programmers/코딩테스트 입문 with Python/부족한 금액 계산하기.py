def solution(price, money, count):
    total = 0
    for c in range(1,count + 1):
        total += price * c
    if money >= total:
        answer = 0
    else:
        answer = total - money
    return answer


print(solution(100, 500, 3))
