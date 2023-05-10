package 코딩테스트입문;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120875
 */
public class 평행 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}}));
        System.out.println(solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}}));
        System.out.println(solution(new int[][]{{1, 1}, {4, 2}, {5, 5}, {7, 7}}));
        System.out.println(solution(new int[][]{{1, 1}, {5, 1}, {1, 10}, {3, 10}}));
    }

    public static double getSlope(int[] dot1, int[] dot2) {
        return ((double)dot2[1] - dot1[1]) /  (dot2[0] - dot1[0]);
    }

    public static int solution(int[][] dots) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                double slope = getSlope(dots[i], dots[j]);
                list.add(slope);
            }
        }
        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i).equals(list.get(list.size() - 1 - i))) return 1;
        }
        return 0;
    }

}
