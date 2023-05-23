package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12926
 */
public class 시저암호 {
    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));

    }

    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isWhitespace(ch)) {
                sb.append(" ");
            } else if (Character.isUpperCase(ch)) {
                if (ch + n > 90) {
                    sb.append((char) (ch + n - 26));
                } else {
                    sb.append((char) (ch + n));
                }
            } else if (Character.isLowerCase(ch)) {
                if (ch + n > 122) {
                    sb.append((char) (ch + n - 26));
                } else {
                    sb.append((char) (ch + n));
                }
            }
        }
        return sb.toString();
    }
}
