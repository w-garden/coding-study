def solution(n):
    answer = 1
    for i in range(1, max(n, 6) + 1):
        if n * i % 6 == 0:
            answer = n*i//6
            break
        if i == min(n, 6):
            answer = n
    return answer


print(solution(1))
print(solution(2))
print(solution(3))
print(solution(4))
print(solution(5))
print(solution(6))
print(solution(7))
print(solution(8))
