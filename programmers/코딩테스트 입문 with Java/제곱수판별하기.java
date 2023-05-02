package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120909
 */
public class 제곱수판별하기 {
    public static void main(String[] args) {
        System.out.println(solution(144));
        System.out.println(solution(976));
    }

    public static int solution(int n) {
        return (int) Math.sqrt(n) == Math.sqrt(n) ? 1 : 2;
    }
}
