package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120887
 */
public class k의개수 {
    public static void main(String[] args) {
        System.out.println(solution(1, 13, 1));
        System.out.println(solution(10, 50, 5));
        System.out.println(solution(3, 10, 2));
    }

    public static int solution(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();
        for (int a = i; a <= j; a++) {
            sb.append(a);
        }
        String str1 = sb.toString();
        String str2 = sb.toString().replaceAll(String.valueOf(k), "");
        return str1.length() - str2.length();
    }
}
