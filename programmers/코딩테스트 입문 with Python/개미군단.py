def solution(hp):
    answer = 0
    a, b = divmod(hp, 5)
    answer += a
    if b != 0:
        c, d = divmod(b, 3)
        answer += (c + d)

    return answer


print(solution(23))
print(solution(24))
print(solution(999))
