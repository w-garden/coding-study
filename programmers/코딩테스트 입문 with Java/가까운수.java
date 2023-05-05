package 코딩테스트입문;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120890
 */
public class 가까운수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 10, 28}, 20));
        System.out.println(solution(new int[]{10, 11, 12}, 13));
        System.out.println(solution(new int[]{4, 10, 11, 12}, 7));
        System.out.println(solution(new int[]{4, 10, 11, 12}, 2));
        System.out.println(solution(new int[]{4, 10, 11, 12}, 10));
        System.out.println(solution(new int[]{4, 10, 11, 12}, 8));
        System.out.println(solution(new int[]{99, 1}, 100));
        System.out.println(solution(new int[]{10, 14, 11, 12}, 13));
        System.out.println(solution(new int[]{10, 11, 12, 14}, 13));
    }

    public static int solution(int[] array, int n) {
        Integer[] nArr = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Set<Integer> set = new HashSet<>(Arrays.asList(nArr));
        int num1 = n;
        int num2 = n;
        while (!set.contains(num1)) {
            if (Collections.max(set) < n) {
                num1 = Collections.max(set);
                break;
            }
            num1++;
        }

        while (!set.contains(num2)) {
            if (Collections.min(set) > n) {
                num2 = Collections.min(set);
                break;
            }
            num2--;
        }

        return num1 - n >= n - num2 ? num2 : num1;
    }
}
