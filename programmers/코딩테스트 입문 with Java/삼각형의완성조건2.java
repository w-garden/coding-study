package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120868
 */
public class 삼각형의완성조건2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2}));
        System.out.println(solution(new int[]{3, 6}));
        System.out.println(solution(new int[]{11, 7}));
    }

    public static int solution(int[] sides) {
        return Math.min(sides[0],sides[1])*2-1;
    }
}
