package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/132267
 */
public class 콜라문제 {
    public static void main(String[] args) {
        System.out.println(solution(4, 2, 20));
        System.out.println(solution(3, 1, 20));
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;
        int coke = n;
        while (coke / a > 0) {
            coke = (n % a) + (n / a) * b;
            System.out.println(coke);
            answer += (n / a) * b;
            n = coke;
        }
        return answer;
    }
}
