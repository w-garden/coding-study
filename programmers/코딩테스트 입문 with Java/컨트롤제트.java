package 코딩테스트입문;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120853
 */
public class 컨트롤제트 {
    public static void main(String[] args) {
        System.out.println(solution("1 2 Z 3"));
        System.out.println(solution("10 20 30 40"));
        System.out.println(solution("10 Z 20 Z 1"));
        System.out.println(solution("10 Z 20 Z"));
        System.out.println(solution("-1 -2 -3 Z"));
    }

    public static int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals("Z")) {
                answer-=Integer.parseInt(str[i-1]);
            }
            else {
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}
