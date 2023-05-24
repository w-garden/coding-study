package 연습문제;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/86491
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 최소직사각형 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        System.out.println(solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
        System.out.println(solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));
    }

    public static int solution(int[][] sizes) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }
        for (int i = 0; i < sizes.length; i++) {
            list.add(sizes[i][0]);
            list2.add(sizes[i][1]);
        }
        Collections.sort(list, Collections.reverseOrder());
        Collections.sort(list2, Collections.reverseOrder());
        return list.get(0) * list2.get(0);
    }
}
