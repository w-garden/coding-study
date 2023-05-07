package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120843
 */

import java.util.ArrayList;
import java.util.List;

public class 공던지기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}, 2));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println(solution(new int[]{1, 2, 3, 4}, 10));
        System.out.println(solution(new int[]{1, 2, 3, 4}, 13));
        System.out.println(solution(new int[]{1, 2, 3, 4}, 4));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 13));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, 5));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println(solution(new int[]{1, 2, 3}, 3));
        System.out.println(solution(new int[]{1, 2, 3}, 1));
        System.out.println(solution(new int[]{1, 2, 3}, 3));
        System.out.println(solution(new int[]{1, 2, 3}, 2));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 20));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 20));
    }

    public static int solution(int[] numbers, int k) {
        int num = 0;
        int length = numbers.length;
        int half_length = length / 2;
        List<Integer> list = new ArrayList<>();

        if (k == 1) {
            return numbers[0];
        }
        if (length % 2 == 0) {
            if (k % (half_length) == 0) {
                num = length - 2;
            } else {
                num = (k % half_length) * 2 - 2;
            }
        } else {
            for (int i = 0; i < numbers.length; i += 2) {
                list.add(numbers[i]);
            }
            for (int i = 1; i < numbers.length; i += 2) {
                list.add(numbers[i]);
            }
            if (k % list.size() == 0) {
                return list.get(list.size()-1);
            } else {
                return list.get(k%list.size()-1);
            }
        }
        return numbers[num];
    }

    public static int 모범답안(int[] numbers, int k) {
        int answer = 2*k-1;
        answer%=numbers.length;
        return answer;
    }
}