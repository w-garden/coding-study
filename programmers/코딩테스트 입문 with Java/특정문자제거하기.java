package 코딩테스트입문;

/**
 * school.programmers.co.kr/learn/courses/30/lessons/120826
 */
public class 특정문자제거하기 {
    public static void main(String[] args) {
        System.out.println(solution("abcdef","f"));
        System.out.println(solution("BCBdbe","B"));
    }
    public static String solution(String my_string, String letter) {
        return my_string.replaceAll(letter,"");
    }
}
