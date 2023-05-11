package 코딩테스트입문;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120876
 */
public class 겹치는선분의길이 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 1}, {2, 5}, {3, 9}}));
        System.out.println(solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}}));
        System.out.println(solution(new int[][]{{0, 5}, {3, 9}, {1, 10}}));
        System.out.println(solution(new int[][]{{0, 2}, {-3, -1}, {-2, 1}})); //2
        System.out.println(solution(new int[][]{{0, 3}, {-3, -1}, {-2, 3}})); //4
        System.out.println(solution(new int[][]{{-3, 3}, {-2, -1}, {1, 2}})); //2
    }

    public static int solution(int[][] lines) {
        int answer = 0;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = lines[0][0]; i < lines[0][1]; i++) { //1, 2번째 선분 비교
            set1.add(i);
            for (int j = lines[1][0]; j < lines[1][1]; j++) {
                if (i == j) {
                    answer++;
                    set2.add(j);
                }
                set1.add(j);
            }
        }
        for (Integer i : set2) set1.remove(i); //이미 일치했던 선분은 제거

        for (int i = lines[2][0]; i < lines[2][1]; i++)  //2,3 번째 선분 비교
            for (Integer n : set1)
                if (i == n) answer++;
        return answer;
    }
}
