package 코딩테스트입문;

import java.util.Arrays;
import java.util.Comparator;

public class 특이한정렬 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6}, 4));
        System.out.println(solution(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30));
        System.out.println(solution(new int[]{1, 1, 1, 30, 40}, 30));
        System.out.println(solution(new int[]{10, 90, 8, 7, 6, 5, 4, 34, 2, 1}, 6));
        System.out.println(solution(new int[]{600, 400, 300, 200, 700, 800, 100, 900}, 500));
    }

    public static int[] solution(int[] numlist, int n) {
        Integer[] rank_arr = Arrays.stream(numlist)
                .boxed()
                .toArray(Integer[]::new);
        Comparator<Integer> comparator = (n1, n2) -> {
            if (Math.abs(n1 - n) == Math.abs(n - n2)) {
                return n1 > n2 ? -1 : 1;
            }
            return Math.abs(n1 - n) - Math.abs(n - n2);
        };
        Arrays.sort(rank_arr, comparator);
        return Arrays.stream(rank_arr).mapToInt(i -> i).toArray();
    }
}