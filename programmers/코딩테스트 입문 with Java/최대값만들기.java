package 코딩테스트입문;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120847
 */
public class 최대값만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
        System.out.println(solution(new int[]{0, 31, 24, 10, 1, 9}));
    }

    public static int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}
