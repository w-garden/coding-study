import re


# 내가 한 풀이
def solution(babbling):
    vowel = ["aya", "ye", "woo", "ma"]
    answer = 0
    for b in babbling:
        for v in vowel:
            b = b.replace(v, ' ')
        if b.strip() == '':
            answer += 1
    return answer


# 프로그래머스에서 발췌한 더 나은 풀이
def solution2(babbling):
    regex = re.compile('^(aya|ye|woo|ma)+$')
    answer = 0
    for e in babbling:
        if regex.match(e):
            answer += 1
    return answer


a = ["aya", "yee", "u", "maa", "wyeoo"]
c = ["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]

print(solution(c))
print(solution2(a))
