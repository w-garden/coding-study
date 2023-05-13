def solution(age):
    language = {0: 'a', 1: 'b', 2: 'c', 3: 'd', 4: 'e', 5: 'f', 6: 'g', 7: 'h', 8: 'i', 9: 'j'}
    answer = ''
    while age // 10 != 0:
        answer += language[age % 10]
        age //= 10
        print(answer)
    answer += language[age % 10]
    return answer[::-1]


print(solution(23))
print(solution(51))
print(solution(100))
print(solution(9))
