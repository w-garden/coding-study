package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12934
 */
public class 정수제곱근판별 {
    public static void main(String[] args) {
        System.out.println(solution(121));
        System.out.println(solution(3));
    }
    public static long solution(long n) {
        double num =Math.sqrt(n);
        return num==(int)num?(long)((num+1)*(num+1)):-1;
    }
}
