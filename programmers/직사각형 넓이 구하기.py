def solution(dots):
    dots.sort()
    return abs((dots[0][1]-dots[1][1])*(dots[0][0]-dots[2][0])
)


print((solution([[1, 1], [2, 1], [2, 2], [1, 2]])))
print((solution([[-1, -1], [1, 1], [1, -1], [-1, 1]])))
