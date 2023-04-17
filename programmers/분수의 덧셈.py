def solution(numer1, denom1, numer2, denom2):
    numer = (numer1 * denom2) + (numer2 * denom1)
    denom = (denom2 * denom1)
    if numer == denom:
        return [1, 1]
    else:
        for i in range(2, min(numer, denom) + 1):
            if numer % i == 0 and denom % i == 0:
                gcd = i
    return [numer//gcd, denom//gcd]


print(solution(11, 22, 22, 22))
