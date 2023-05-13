def solution(numbers, k):
    k = k * 2 - 1
    if len(numbers) % 2 == 0:
        answer = numbers[k % len(numbers) - 1]
    else:
        answer = numbers[(k % (len(numbers) * 2) - 1) % len(numbers)]
    return answer


print(solution([1, 2, 3, 4], 2))
print(solution([1, 2, 3, 4, 5, 6], 5))
print(solution([1, 2, 3], 3))
print(solution([1, 2, 3, 4, 5, 6, 7], 6))
print(solution([1,2,3], 6))

