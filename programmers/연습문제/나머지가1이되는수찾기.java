package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/87389
 */
public class 나머지가1이되는수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
    }

    public static int solution(int n) {
        int answer=0;
        for (int i = 2; i <= n; i++) {
            if ((n - 1) % i == 0) {
                answer= i;
                break;
            }
        }
        return answer;
    }
}
