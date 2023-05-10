package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120871
 */
public class 저주의숫자3 {
    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println(solution(40));
    }

    public static int solution(int n) {
        int answer = 0;
        int cnt = 0;
        while (cnt != n) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) continue;
            cnt++;
        }
        return answer;
    }
}
