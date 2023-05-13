def solution(n):
    answer = 0

    for i in range(1, n + 1):
        a, b = divmod(n, i)
        if b == 0:
            answer += 1
        if i >= n // 2:
            if i == n // 2:
                answer += 1
            break
    return answer


print(solution(20))
