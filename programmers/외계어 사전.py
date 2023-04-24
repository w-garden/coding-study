def solution(spell, dic):
    answer = 0

    for d in dic:
        cnt = ''
        for s in spell:
            if d.count(s) == 1:
                cnt += '1'
        if len(cnt) == len(spell):
            answer += 1
    return 2 if answer==0 else answer


print(solution(["p", "o", "s"], ["sod", "eocd", "qixm", "adio", "soo"]))
print(solution(["z", "d", "x"], ["def", "dww", "dzx", "loveaw"]))
print(solution(["s", "o", "m", "d"], ["moos", "dzx", "smm", "sunmmo", "som"]))
