package 연습문제;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/176963?language=java
 */
public class 추억점수 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}}));
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < name.length; j++) {
                if (Arrays.asList(photo[i]).contains(name[j]))
                    answer[i] += yearning[j];
            }
        }
        return answer;
    }
}

