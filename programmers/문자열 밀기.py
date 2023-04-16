def solution(A, B):
    answer = 0
    for i in range(1, len(B) + 1):
        if A[:len(B)] == B:
            break
        A = A[-1] + A[:len(B) - 1]
        answer += 1
    if answer == len(B):
        answer = -1

    return answer


print(solution("aba", "aba"))
print(solution("apple", "elppa"))
