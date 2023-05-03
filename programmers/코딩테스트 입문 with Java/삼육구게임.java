package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120891
 */
public class 삼육구게임 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(29423));
    }
    public static int solution(int order) {
        return String.valueOf(order).length()-String.valueOf(order).replaceAll("[369]","").length();
    }
}
