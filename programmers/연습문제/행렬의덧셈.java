package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12950
 */
public class 행렬의덧셈 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}}));
        System.out.println(solution(new int[][]{{1}, {3}}, new int[][]{{3}, {4}}));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i=0; i<answer.length;i++){
            for(int j=0; j<answer[i].length;j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
}
