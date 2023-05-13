def solution(array, n):
    answer = 0
    min_num = 101
    for a in array:
        if abs(a - n) < min_num or (abs(a - n) == min_num and a < answer):
            min_num = abs(a - n)
            answer = a
    return answer


print(solution([3, 10, 28], 20))
print(solution([10, 11, 12], 13))
print(solution([10, 11, 12], 13))
