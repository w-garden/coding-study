package 코딩테스트입문;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120899
 */
public class 가장큰수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 8, 3}));
        System.out.println(solution(new int[]{9, 10, 11, 8}));
    }

    public static int[] solution(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        Arrays.sort(array);
        return new int[]{array[array.length-1],list.indexOf(array[array.length-1])};
    }
}
