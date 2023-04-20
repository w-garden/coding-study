def solution(emergency):
    answer = []
    sort_array = sorted(emergency)
    sort_array.reverse()

    for n in emergency:
        print(n)
        answer.append(sort_array.index(n) + 1)
    return answer


print(solution([3, 76, 24]))
