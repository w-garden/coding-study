import re


def solution(my_string):
    answer = 0
    my_string = re.sub('[^0-9]', ' ', my_string)
    my_string = re.sub(r'\s+', ' ', my_string).strip()
    if my_string == '':
        return answer
    my_list = my_string.split(" ")
    for a in my_list:
        answer += int(a)
    return answer


print(solution("aAb1B2cC34oOp"))
print(solution("1a2b3c4d123Z"))
print(solution("asd"))
