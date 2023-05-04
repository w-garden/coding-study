package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120848
 */
public class 팩토리얼 {
    public static void main(String[] args) {
        System.out.println(solution(3628800));
        System.out.println(solution(7));
        System.out.println(solution(1));
        System.out.println(solution(2));
    }

    public static int solution(int n) {
        int answer = 1;
        int total = 1;
        if (n < 2) {
            return 1;
        }
        while (total < n) {
            total *= answer;
            answer++;
        }
        return n == total ? answer - 1 : answer - 2;
    }
}
