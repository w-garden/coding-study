def solution(array):
    answer = 0
    for n in array:
        a = str(n)
        answer += a.count('7')
    return answer


def solution2(array):
    return str(array).count('7')


print(solution([7, 77, 17]))
print(solution2([7, 77, 17]))
