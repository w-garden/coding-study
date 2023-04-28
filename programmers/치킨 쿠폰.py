def solution(chicken):
    answer = 0
    while chicken // 10 != 0:
        a, b = divmod(chicken, 10)
        answer += a
        chicken = (a + b)

    return answer


print(solution(1999))
print(solution(1081))
print(solution(100))
print(solution(90))
print(solution(99))


print(solution(199))
