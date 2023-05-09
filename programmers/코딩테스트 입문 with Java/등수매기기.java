package 코딩테스트입문;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120882
 */
public class 등수매기기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}}));
        System.out.println(solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}}));
    }

    public static int[] solution(int[][] score) {

        int[] answer = new int[score.length];
        int rank = 1;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> score_list = new ArrayList<>();
        for (int[] ints : score) {
            score_list.add(ints[0] + ints[1]);
            map.putIfAbsent(ints[0] + ints[1], 0);
            map.put(ints[0] + ints[1], map.get(ints[0] + ints[1]) + 1);
        }

        List<Integer> rank_list = new ArrayList<>(map.keySet());
        Collections.sort(rank_list, Collections.reverseOrder());
        for (Integer integer : rank_list) {
            for (int i = 0; i < score_list.size(); i++) {
                if (integer.equals(score_list.get(i))) {
                    answer[i] = rank;
                }
            }
            rank += map.get(integer);
        }
        return answer;
    }
}
