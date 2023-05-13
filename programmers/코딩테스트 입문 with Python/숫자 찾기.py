def solution(num, k):
    a = [int(x) for x in str(num)]
    return -1 if a.count(k) == 0 else a.index(k) + 1


print(solution(29183, 1))
print(solution(232443, 4))
print(solution(123456, 7))
