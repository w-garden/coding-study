package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120924/solution_groups?language=java
 */
public class 다음에올숫자 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
        System.out.println(solution(new int[]{2, 4, 8}));
        System.out.println(solution(new int[]{4, 16, 64}));
        System.out.println(solution(new int[]{4, 3, 2}));
        System.out.println(solution(new int[]{-2, -1, 0}));
    }

    public static int solution(int[] common) {
        int answer = 0;
        if (common[2] - common[1] == common[1] - common[0]) {
            answer = common[common.length - 1] + common[2] - common[1];
        } else {
            answer = common[common.length - 1] * common[2] / common[1];
        }
        return answer;
    }
}
