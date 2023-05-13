import collections


def solution(array):
    arr = collections.Counter(array)
    if len(arr) == 1:
        return array[0]
    else:
        arr2 = arr.most_common(2)
        a, b = arr2[0]
        c, d = arr2[1]
        answer = a
        if b == d:
            answer = -1
        return answer


print(solution([1]))
print(solution([1, 1, 2, 2]))
print(solution([1, 2, 3, 3, 3, 4]))
