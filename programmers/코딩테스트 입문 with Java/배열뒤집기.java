package 코딩테스트입문;

/**
 * school.programmers.co.kr/learn/courses/30/lessons/120821
 */
public class 배열뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4, 5}));
        System.out.println(solution(new int[] {1, 1, 1, 1, 1, 2}));
        System.out.println(solution(new int[] {1, 0, 1, 1, 1, 3, 5}));
    }
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i=0; i<=num_list.length-1;i++){
            answer[num_list.length-1-i]=num_list[i];
        }
        return answer;
    }
}
