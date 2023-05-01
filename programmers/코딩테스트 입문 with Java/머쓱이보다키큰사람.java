package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120585
 */
public class 머쓱이보다키큰사람 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{149, 180, 192, 170},167));
        System.out.println(solution(new int[]{180, 120, 140},190));
    }
    public static int solution(int[] array, int height) {
        int answer = 0;
        for (int i : array) {
            if(i>height){
                answer++;
            }
        }
        return answer;
    }
}
