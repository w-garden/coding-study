def solution(box, n):
    answer = 1
    for b in box:
        answer *= b // n
    return answer


print(solution([1, 1, 1], 1))
print(solution([10, 8, 6], 3))
