package 코딩테스트입문;

/**
 * school.programmers.co.kr/learn/courses/30/lessons/120810
 */
public class 나머지구하기 {
    public static void main(String[] args) {
        System.out.println(solution(3,2));
        System.out.println(solution(10,5));
    }
    public static int solution(int num1, int num2) {
        return num1%num2;
    }
}
