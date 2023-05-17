package 연습문제;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12917
 */
public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
    public static String solution(String s) {
        String [] arr = s.split("");
        Arrays.sort(arr, Comparator.reverseOrder());

        return Arrays.stream(arr).collect(Collectors.joining());
    }
}
