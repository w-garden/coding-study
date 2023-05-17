package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/77884
 */
public class 약수의개수와덧셈 {
    public static void main(String[] args) {
        System.out.println(solution(13, 17));
        System.out.println(solution(24, 27));
    }

    public static int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int diviseur_num = 1;
            for (int j = 2; j <= i; j++)
                if (i % j == 0) diviseur_num++;
            answer += diviseur_num % 2 == 0 ? i : -i;
        }
        return answer;
    }
}
