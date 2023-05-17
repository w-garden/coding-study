package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12918
 */
public class 문자열다루기기본 {
    public static void main(String[] args) {
        System.out.println(solution("a234"));
        System.out.println(solution("1234"));
        System.out.println(solution("a"));
        System.out.println(solution("02"));
        System.out.println(solution("02a4"));
    }

    public static boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6)
            return s.chars().allMatch(Character::isDigit);
        return false;
    }
}
