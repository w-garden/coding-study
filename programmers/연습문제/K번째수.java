package 연습문제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42748
 */
public class K번째수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            list.clear();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++)
                list.add(array[j]);
            Collections.sort(list);
            answer[i] = list.get(commands[i][2] - 1);
        }
        return answer;
    }
}
