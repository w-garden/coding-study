package 연습문제;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/138477?language=java
 */

public class 명예의전당_1 {
    public static void main(String[] args) {
        System.out.println(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200}));
        System.out.println(solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}));
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] awards = new int[k];

        for (int i = 0; i < k; i++) {
            awards[i] = 2001;
        }
        for (int i = 0; i < score.length; i++) {
            if (i < k)
                awards[i] = score[i];
            else if (score[i] > awards[0])
                awards[0] = score[i];

            Arrays.sort(awards);
            answer[i] = awards[0];
        }
        return answer;
    }
}
