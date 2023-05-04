package 코딩테스트입문;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120886
 */
public class A로B만들기 {
    public static void main(String[] args) {
        System.out.println(solution("olleh", "hello"));
        System.out.println(solution("allpe", "apple"));
    }

    public static int solution(String before, String after) {
        String[] arr1 = before.split("");
        String[] arr2 = after.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return (Arrays.toString(arr1)).equals(Arrays.toString(arr2))?1:0;
    }
}
