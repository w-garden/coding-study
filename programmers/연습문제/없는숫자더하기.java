package 연습문제;

import java.util.Arrays;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/86051
 */
public class 없는숫자더하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
        System.out.println(solution(new int[]{5,8,4,0,6,7,9}));
    }

    public static int solution(int[] numbers) {
        return 45-Arrays.stream(numbers).sum();
    }
}
