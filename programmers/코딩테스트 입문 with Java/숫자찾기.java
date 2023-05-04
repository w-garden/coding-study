package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120904
 */
public class 숫자찾기 {
    public static void main(String[] args) {
        System.out.println(solution(29183, 1));
        System.out.println(solution(232443, 4));
        System.out.println(solution(123456, 7));
    }

    public static int solution(int num, int k) {
        int index = String.valueOf(num).indexOf(String.valueOf(k));
        return index != -1 ? index + 1 : -1;
    }
}
