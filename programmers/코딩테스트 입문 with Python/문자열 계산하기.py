def solution(my_string):
    my_list = my_string.split(' ')
    answer = int(my_list[0])

    for i in range(2, len(my_list), 2):
        if my_list[i - 1] == '-':
            answer -= int(my_list[i])
        else:
            answer += int(my_list[i])
    return answer


print(solution("3 + 4"))
print(solution("3 + 4 + 4 + 3"))
print(solution("100000 + -100000"))
