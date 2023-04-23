def solution(i, j, k):
    # answer = 0
    # for c in range(i, j + 1):
    #     answer+=str(c).count(str(k))


    # 더 나은 풀이
    answer= sum([str(c).count(str(k)) for c in range(i,j+1)])
    return answer


print(solution(1, 13, 1))
print(solution(10, 50, 5))
print(solution(3, 10, 2))
