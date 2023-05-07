package 코딩테스트입문;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120860
 */

import java.util.Arrays;
import java.util.Comparator;

public class 직사각형의넓이구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}));
        System.out.println(solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}));
    }

    public static int solution(int[][] dots) {
        Arrays.sort(dots, Comparator.comparingInt((int[] o) -> o[0]));
        int answer=Math.abs(dots[0][1]-dots[1][1]);
        Arrays.sort(dots, Comparator.comparingInt((int[] o) -> o[1]));
        answer*=Math.abs(dots[0][0]-dots[1][0]);
        return answer;
    }
}
