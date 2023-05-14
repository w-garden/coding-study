package 연습문제;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12944
 */
public class 평균구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
        System.out.println(solution(new int[]{5, 5}));
    }

    public static double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}
