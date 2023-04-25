def solution(keyinput, board):
    max_w = board[0] // 2
    max_h = board[1] // 2
    x, y = 0, 0
    direction = {"left": (x - 1, y), "right": (x + 1, y), "up": (x, y + 1), "down": (x, y - 1)}
    for k in keyinput:
        tx, ty = direction.get(k)
        x += tx
        y += ty
        if abs(x) > max_w or abs(y) > max_h:
            x -= tx
            y -= ty
    return [x, y]


print(solution(["left", "right", "up", "right", "right"], [11, 11]))
print(solution(["down", "down", "down", "down", "down"], [7, 9]))
