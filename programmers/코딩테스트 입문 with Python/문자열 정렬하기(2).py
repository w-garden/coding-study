
def solution(my_string):

    return ''.join(s for s in sorted(my_string.lower()))


print(solution("Bcad"))
print(solution("heLLo"))
print(solution("Python"))