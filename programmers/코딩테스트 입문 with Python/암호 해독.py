def solution(cipher, code):
    answer = ''
    # for c in range(code, len(cipher)+1, code):
    #     answer += cipher[c - 1]
    answer = cipher[code-1::code]
    return answer


print(solution("dfjardstddetckdaccccdegk", 4))
print(solution("pfqallllabwaoclk", 2))
