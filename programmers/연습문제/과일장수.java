package 연습문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/135808?language=java
 */

/*
1. 사과 상태 1점 ~ k점
2. 한 상자에는 m개씩 담음
3. 가장 낮은 점수의 사과가 p점인 경우 사과 한 상자의 가격은 p * m

 */
public class 과일장수 {
    public static void main(String[] args) {
        System.out.println(solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
        System.out.println(solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] integer_score = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(integer_score, Collections.reverseOrder());
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= integer_score.length / m; i++) {
            list.clear();
            for (int j = 1; j <= m; j++)
                list.add(integer_score[j * i - 1]);
            answer += (Collections.min(list) * m);
        }
        return answer;
    }
}
