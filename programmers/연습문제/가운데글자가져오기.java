package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12903
 */
public class 가운데글자가져오기 {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }

    public static String solution(String s) {
        int center = s.length() / 2;
        if (s.length() % 2 == 1)
            return String.valueOf(s.charAt(center));
        return s.substring(center - 1, center + 1);
    }
}
