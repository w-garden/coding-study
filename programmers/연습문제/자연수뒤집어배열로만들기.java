package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */
public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        System.out.println(solution(12345));
    }

    public static int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        int[] answer = new int[sb.length()];
        sb.reverse();
        for (int i = 0; i < sb.length(); i++) {
            answer[i] = sb.charAt(i)-48;
        }


        return answer;
    }
}
