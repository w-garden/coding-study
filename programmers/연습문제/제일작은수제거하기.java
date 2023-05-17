package 연습문제;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12935
 */
public class 제일작은수제거하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 3, 2, 1}));
        System.out.println(solution(new int[]{10}));
    }

    public static int[] solution(int[] arr) {

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        if (list.size() == 1) return new int[]{-1};

        list.remove(list.indexOf(Arrays.stream(arr).min().getAsInt()));
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

