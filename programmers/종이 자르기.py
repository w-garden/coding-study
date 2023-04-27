def solution(M, N):
    # return min(M, N) - 1 + (max(M, N) - 1) * min(M, N)
    return (M*N)-1


print(solution(2,2))
print(solution(2,5))
print(solution(1,1))