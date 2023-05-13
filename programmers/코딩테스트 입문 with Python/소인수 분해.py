def solution(n):
    answer = []
    while n != 1:
        for i in range(2, n + 1):
            if n % i == 0:
                answer.append(i)
                n //= i
                break
    return sorted(list(set(answer)))





print(solution(12))
print(solution(420))
print(solution(33))
print(solution(17))
