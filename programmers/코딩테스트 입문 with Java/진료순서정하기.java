import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120835
 */
public class 진료순서정하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 76, 24}));
        System.out.println(solution(new int[]{1,2,3,4,5,6,7}));
        System.out.println(solution(new int[]{30,10,23,6,100}));
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if(emergency[i]<emergency[j]){
                    answer[i]++;
                }
            }answer[i]++;
        }
        return answer;
    }
}
