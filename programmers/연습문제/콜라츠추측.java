package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12943
 */
public class 콜라츠추측 {
    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }

    public static int solution(int num) {
        int answer = 0;
        if (num == 1) return 0;

        while (answer < 500) {
            if (num % 2 == 0) num /= 2;
            else if (num % 2 == 1) num = num * 3 + 1;

            answer++;
            if (num == 1) break;
        }
        if (answer == 500 && num != 1) return -1;

        return answer;
    }

}
