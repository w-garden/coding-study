package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120844
 */
public class 배열회전시키기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}, "right"));
        System.out.println(solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left"));
    }

    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        switch (direction){
            case "right":
                answer[0]=numbers[numbers.length-1];
                for (int i = 0; i < numbers.length-1; i++) {
                    answer[i+1]=numbers[i];
                }
                break;
            case "left":
                answer[numbers.length-1]=numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    answer[i-1]=numbers[i];
                }break;
        }
        return answer;
    }
}
