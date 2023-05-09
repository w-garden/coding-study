package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120863?language=java
 */
public class 다항식더하기 {
    public static void main(String[] args) {
        System.out.println(solution("3x + 7 + x"));
        System.out.println(solution("x + x + x"));
        System.out.println(solution("x"));
        System.out.println(solution("9"));
        System.out.println(solution("3x"));
    }

    public static String solution(String polynomial) {
        int num1 = 0;
        int num2 = 0;
        StringBuilder sb = new StringBuilder();
        for (String str : polynomial.split(" \\+ ")) {
            if (str.contains("x")) {
                str = str.replace("x", "");
                if (str.equals("")) {
                    num1++;
                } else {
                    num1 += Integer.parseInt(str);
                }
            } else {
                num2 += Integer.parseInt(str);
            }
        }

        if (num1 > 1) sb.append(num1);
        if (num1 != 0) sb.append("x");
        if (num1 != 0 && num2 != 0) sb.append(" + ");
        if (num2 != 0) sb.append(num2);

        return sb.toString();
    }
}
