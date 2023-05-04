package 코딩테스트입문;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120911
 */
public class 문자열정렬하기2 {
    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
        System.out.println(solution("heLLo"));
        System.out.println(solution("Python"));

    }

    public static String solution(String my_string) {
        String[] arr = my_string.toLowerCase().split("");
        Arrays.sort(arr);
        return String.join("", arr);
    }
}
