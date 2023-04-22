def solution(rsp):
    win = {"2": "0", "0": "5", "5": "2"}
    answer = ''
    for r in rsp:
        answer += win.get(r)
    return answer


print(solution("2"))
print(solution("205"))
