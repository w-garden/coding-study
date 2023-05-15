package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12912
 */
public class 두정수사이의합 {
    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(3, 3));
        System.out.println(solution(5, 3));
    }

    public static long solution(int a, int b) {
        long answer = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++)
            answer += i;

        return answer;
    }
}
