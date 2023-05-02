package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181942
 */
public class 문자열섞기 {
    public static void main(String[] args) {
        System.out.println(solution("aaaaa", "bbbbb"));
    }

    public static String solution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }
}
