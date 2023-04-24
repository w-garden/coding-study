def solution(my_str, n):
    answer = []
    while len(my_str) // n != 0:
        answer.append(my_str[:n])
        my_str = my_str[n:]
    if my_str != '':
        answer.append(my_str)

    return answer


print(solution("abc1Addfggg4556b", 6))
print(solution("abcdef123", 3))
print(solution("abcdef123", 2))
