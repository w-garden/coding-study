package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120837
 */
public class 개미군단 {
    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(24));
        System.out.println(solution(999));
        System.out.println(solution(25));
        System.out.println(solution(9));
        System.out.println(solution(2));
    }

    public static int solution(int hp) {
        int answer = 0;
        if (hp < 3) {
            return hp;
        }
        answer += (hp / 5);

        hp %= 5;
        if (hp > 3) answer += 2;
        else if (hp > 0) answer++;
        return answer;
    }

}
