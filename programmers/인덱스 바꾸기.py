def solution(my_string, num1, num2):
    my_list = list(my_string)
    my_list[num1], my_list[num2] = my_list[num2], my_list[num1]
    return ''.join(my_list)


print(solution("hello", 1, 2))
print(solution("I love you", 3, 6))
