def solution(score):
    avg = []
    answer = []
    for s in score:
        avg.append((s[0] + s[1]) / 2)
    avg.sort(reverse=True)
    for s in score:
        answer.append(avg.index((s[0] + s[1]) / 2) + 1)
    return answer


print(solution([[80, 70], [90, 50], [40, 70], [50, 80]]))
print(solution([[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]))
print(solution([[0, 1], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]))
