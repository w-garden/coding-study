def solution(polynomial):
    my_list = polynomial.split(" ")
    my_list.sort()
    a, b = 0, 0
    for l in my_list:
        if l == '+':
            continue
        if l.count('x'):
            if l == 'x':
                a += 1
            else:
                l = l.replace('x', '')
                a += int(l)
        else:
            b += int(l)

    answer = 'x'

    if a > 1 and b > 0:
        answer = str(a) + 'x + ' + str(b)
    elif a == 1 and b > 0:
        answer = 'x + ' + str(b)
    elif a > 1 and b == 0:
        answer = str(a) + 'x'
    elif a == 0:
        answer = str(b)

    return answer


print(solution("3x + 7 + x"))
print(solution("x + x + x"))
print(solution("2x"))
print(solution("x + 2"))
print(solution("2 + x"))
print(solution("1"))
print(solution("2"))
print(solution("2 + 2"))
print(solution("2 + 2 + 2x"))
print(solution("x + 2x"))
print(solution("x"))
print(solution("x + 1"))
print(solution("x + 1"))
print(solution("1 + x + 1"))
print(solution("x + x + 1"))
print(solution("9 + 2x"))
print(solution("2x + 2x + 0"))
print(solution("0 + 2x + 0"))
print(solution("0 + 0"))
print(solution("0"))
print(solution("0 + 2 + 9"))
print(solution("0x + 2 + 9"))
print(solution("0x + 0x + 2x"))




