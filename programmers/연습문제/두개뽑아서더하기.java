package 연습문제;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/68644
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 4, 1}));
        System.out.println(solution(new int[]{5, 0, 2, 7}));
    }

    public static int[] solution(int[] numbers) {
        Set<Integer> sum = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                sum.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer= Arrays.stream(sum.stream()
                .toArray(Integer[]::new))
                .mapToInt(Integer::intValue)
                .toArray();
        Arrays.sort(answer);
        return answer;
    }
}
