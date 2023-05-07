package 코딩테스트입문;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120852
 */
public class 소인수분해 {
    public static void main(String[] args) {
        System.out.println(solution(12));
        System.out.println(solution(17));
        System.out.println(solution(420));
        System.out.println(solution(170));
    }

    public static int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    set.add(i);
                    n /= i;
                    break;
                }
            }
        }
        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        return arr;
    }
}
