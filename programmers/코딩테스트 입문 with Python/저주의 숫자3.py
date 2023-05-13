def solution(n):
    answer = 0
    cnt = 0

    while True:
        if answer % 3 != 0 and str(answer).count('3') == 0:
            cnt += 1
        if cnt == n:
            break
        answer += 1
    return answer


print(solution(15))
print(solution(40))
