package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120841
 */
public class 점의위치구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 4}));
        System.out.println(solution(new int[]{-7, 9}));
    }

    public static int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];

        if (x > 0) {
            if (y > 0) {
                answer = 1;
            } else {
                answer = 4;
            }
        }
        if (x < 0) {
            if (y < 0) {
                answer = 3;
            } else {
                answer = 2;
            }
        }
        return answer;
    }
}
