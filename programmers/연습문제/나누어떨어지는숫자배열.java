package 연습문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 */
public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 9, 7, 10}, 5));
        System.out.println(solution(new int[]{2, 36, 1, 3}, 1));
        System.out.println(solution(new int[]{3, 2, 6}, 10));
    }

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0)
                list.add(i);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        if (answer.length == 0) return new int[]{-1};
        Arrays.sort(answer);
        return answer;
    }
}
