package 코딩테스트입문;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120905
 */
public class n의배수고르기 {
    public static void main(String[] args) {
        System.out.println(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}));
        System.out.println(solution(5, new int[]{1, 9, 3, 10, 13, 5}));
        System.out.println(solution(12, new int[]{2, 100, 120, 600, 12, 12}));
    }

    public static int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int i : numlist) {
            if (i % n == 0) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
