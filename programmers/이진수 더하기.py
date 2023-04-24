def solution(bin1, bin2):
    answer = ''
    num = int(bin1, 2) + int(bin2, 2)
    while num // 2 != 0:
        answer += str(num % 2)
        num = num // 2
    answer += str(num)
    return answer[::-1]


print(solution("10", "11"))
print(solution("1001","1111"))
