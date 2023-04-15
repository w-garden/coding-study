""" 테스트 케이스
common = [1, 2, 3, 4]
common = [2, 4, 8]
common = [-16, -8, -4]
common = [-4, -6, -8]
common = [0,-2,-4, -6, -8]

"""
common = [-16, -8, -4, -2, -1]


def solution(common):
    if common[0] - common[1] == common[1] - common[2]:
        answer = common[len(common) - 1] + common[1] - common[0]
    else:
        answer = common[len(common) - 1] * common[2] // common[1]
    return answer


print(solution(common))
