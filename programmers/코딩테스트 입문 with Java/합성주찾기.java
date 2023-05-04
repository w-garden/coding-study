package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120846
 */
public class 합성주찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(15));
        System.out.println(solution(1));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 4; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
