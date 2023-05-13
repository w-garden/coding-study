def factorial(balls):
    if balls <= 1:
        return 1
    return balls * factorial(balls - 1)


def solution(balls, share):
    answer=factorial(balls)//(factorial(balls-share)*factorial(share))

    if share == 1:
        return balls
    return answer


print(solution(3, 2))
print(solution(5, 3))
print(solution(30, 2))
