def solution(s):
    answer = ''
    for a in sorted(s):
        if s.count(a) == 1:
            answer += a
    return answer


print(solution("abcabcadc"))
print(solution("abdc"))
print(solution("hello"))
print(solution("aaa"))
