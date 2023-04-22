def solution(numbers):
    numbers.sort()
    # return numbers[0]*numbers[1] if numbers[0]*numbers[1]>=numbers[len(numbers)-1]*numbers[len(numbers)-2] else numbers[len(numbers)-1]*numbers[len(numbers)-2]
    return max(numbers[0]*numbers[1],numbers[-1]*numbers[-2])


print(solution([1, 2, -3, 4, -5]))
print(solution([0, -31, 24, 10, 1, 9]))
print(solution([10, 20, 30, 5, 5, 20, 5]))