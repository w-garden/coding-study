package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120583
 */
public class 중복된숫자개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,2,3,4,5},2));
        System.out.println(solution(new int[]{0,2,3,4},0));
    }
    public static int solution(int[] array, int n) {
        int answer = 0;
        for (int i : array) {
            if(i==n){
                answer++;
            }
        }
        return answer;
    }
}
