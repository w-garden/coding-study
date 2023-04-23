def solution(my_string):
    my_list = list(my_string)
    for i in range(len(my_list)-1, -1, -1):
        if my_list.count(my_list[i]) >= 2:
            my_list.pop(i)
    return ''.join(i for i in my_list)









print(solution("people"))
print(solution("We are the world"))
