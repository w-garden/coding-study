package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120836
 */
public class 순서쌍의개수 {
    public static void main(String[] args) {
//        System.out.println(solution(20));
//        System.out.println(solution(100));
//        System.out.println(solution(30));
        System.out.println(solution(1));
    }

    public static int solution(int n) {
        int answer = 0;
        if (n == 1) return 1;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) answer++;
            if (n / 2 == i) answer++;
        }

        return answer;
    }
}
