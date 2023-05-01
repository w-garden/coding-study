package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120824
 */
public class 짝수홀수개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5}));
        System.out.println(solution(new int[]{1,3,5,7}));
    }
    public static int[] solution(int[] num_list){
        int[] answer= new int[2];
        for (int i : num_list) {
            if (i%2==0){
                answer[0]++;
            }
            else {
                answer[1]++;
            }
        }
        return answer;
    }
}
