package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120842
 */
public class 이차원으로만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2));
        System.out.println(solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3));
    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < n; j++) {
                 answer[i][j]=num_list[n*i+j];
            }
        }

        return answer;
    }
}
