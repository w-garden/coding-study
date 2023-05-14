package 연습문제;


import java.math.BigInteger;
import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */
public class x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        System.out.println(solution(2, 5));
        System.out.println(solution(4, 3));
        System.out.println(solution(-4, 2));
        System.out.println(solution( -10000000, 1000));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i <= n; i++) {
            BigInteger bigInteger = new BigInteger(String.valueOf((long)x*i));
            answer[i - 1] =bigInteger.longValue();
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
