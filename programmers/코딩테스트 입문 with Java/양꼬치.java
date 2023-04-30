package 코딩테스트입문;

/**
 * school.programmers.co.kr/learn/courses/30/lessons/120830
 */
public class 양꼬치 {
    public static void main(String[] args) {
        System.out.println(solution(10,3));
        System.out.println(solution(64,6));
    }
    public static int solution(int n, int k) {
        return  n*12000+(k-n/10)*2000;
    }

}
