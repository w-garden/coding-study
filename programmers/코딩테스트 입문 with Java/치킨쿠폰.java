package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120884
 */
public class 치킨쿠폰 {
    public static void main(String[] args) {
        System.out.println(solution(100));
        System.out.println(solution(1081));
    }

    public static int solution(int chicken) {
        int answer = 0;
        while (true) {
            answer += (chicken / 10);
            chicken = chicken % 10 + chicken / 10;
            if (chicken < 10) {
                return answer;
            }
        }
    }
}
