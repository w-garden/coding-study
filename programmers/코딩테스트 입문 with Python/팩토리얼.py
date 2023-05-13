def factorial(num):
    if num == 1:
        return 1
    return num * factorial(num - 1)


def solution(n):
    number = 10
    while True:
        if factorial(number) <= n:
            break
        number -= 1
    return number



print(solution(3628800))
print(solution(7))
