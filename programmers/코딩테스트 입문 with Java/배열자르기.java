package 코딩테스트입문;

/**
 * school.programmers.co.kr/learn/courses/30/lessons/120833
 */
public class 배열자르기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5},1,3));
        System.out.println(solution(new int[]{1,3,5},1,2));

    }
    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        for(int i=0;i<answer.length;i++){
            answer[i]=numbers[i+num1];
        }
        return answer;
    }
}
