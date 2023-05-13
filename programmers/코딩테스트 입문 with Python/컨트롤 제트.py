def solution(s):
    num_list = s.split(" ")
    answer = 0
    for i in range(len(num_list)):
        if num_list[i] == 'Z':
            answer -= int(num_list[i-1])
        else:
            answer += int(num_list[i])
    return answer


print(solution("1 2 Z 3"))
print(solution("10 20 30 40"))
print(solution("10 Z 20 Z 1"))
