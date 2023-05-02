package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120903
 */
public class 배열의유사도 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}));
        System.out.println(solution(new String[]{"n", "omg"}, new String[]{"m", "dot"}));
    }

    public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String s01 : s1) {
            for (String s02 : s2) {
                if(s01.equals(s02)){
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
