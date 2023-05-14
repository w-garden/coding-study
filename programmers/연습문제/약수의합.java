package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12928
 */
public class 약수의합 {
    public static void main(String[] args) {
        System.out.println(solution(12));
        System.out.println(solution(5));
        System.out.println(solution(17));
        System.out.println(solution(1));
    }

    public static int solution(int n) {
        int answer = 1;
        if(n==0){
            return 0;
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                answer+=i;
            }
        }
        return answer;
    }
}
