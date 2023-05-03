package 코딩테스트입문;

import java.math.BigInteger;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120840
 */
public class 구슬을나누는경우의수 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(5, 3));
        System.out.println(solution(30, 29));
        System.out.println(solution(29, 28));
        System.out.println(solution(3, 1));
        System.out.println(solution(4, 2));
    }

    public static int solution(int balls, int share) {
        return (factorial(balls).divide(factorial(balls-share).multiply(factorial(share)))).intValue();
    }
    public static BigInteger factorial(long num) {
        BigInteger n = new BigInteger(String.valueOf(num));
        if (num  < 2) {
            return new BigInteger("1");
        }
        return n.multiply(factorial(num - 1));
    }
}
