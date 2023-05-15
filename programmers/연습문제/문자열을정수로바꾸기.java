package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12925
 */
public class 문자열을정수로바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("1234"));
        System.out.println(solution("-1234"));
        System.out.println(solution("+1234"));
    }

    public static int solution(String s) {
        if (s.contains("-"))
            return -Integer.parseInt(s.substring(1));
        if (s.contains("+"))
            s = s.substring(1);
        return Integer.parseInt(s);
    }
}
