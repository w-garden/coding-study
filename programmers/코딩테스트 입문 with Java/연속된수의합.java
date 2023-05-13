package 코딩테스트입문;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120923
 */

import java.util.Arrays;

public class 연속된수의합 {
    public static void main(String[] args) {
        System.out.println(solution(3, 12));
        System.out.println(solution(5, 15));
        System.out.println(solution(4, 14));
        System.out.println(solution(5, 5));
    }

    public static int[] solution(int num, int total) {
        int[] answer = new int[num];

        int first_num = total / num - num / 2;
        if (num % 2 == 0) first_num++;

        for (int i = 0; i < num; i++) {
            answer[i] = first_num;
            first_num++;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
