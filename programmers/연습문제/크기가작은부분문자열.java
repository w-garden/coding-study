package 연습문제;

import java.math.BigInteger;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/147355
 */
public class 크기가작은부분문자열 {
    public static void main(String[] args) {
        System.out.println(solution("3141592", "271"));
        System.out.println(solution("500220839878", "7"));
        System.out.println(solution("10203", "15"));
        System.out.println(solution("10000000", "10000001"));
        System.out.println(solution("55", "60"));
        System.out.println(solution("100000000000000000", "100000000000000000"));
    }

    public static int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            if (Long.valueOf(t.substring(i, i + p.length())) <= Long.valueOf(p)) {
                answer++;
            }
        }
        return answer;
    }
}
