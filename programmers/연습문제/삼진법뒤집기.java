package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/68935
 */
public class 삼진법뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution(45));
        System.out.println(solution(125));
    }
    public static int solution(int n) {
        StringBuilder sb= new StringBuilder(Integer.toString(n,3));
        sb.reverse();
        return Integer.valueOf(sb.toString(),3);
    }
}
