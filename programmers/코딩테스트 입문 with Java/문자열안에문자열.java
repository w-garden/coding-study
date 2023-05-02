package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120908
 */
public class 문자열안에문자열 {
    public static void main(String[] args) {
        System.out.println(solution("ab6CDE443fgh22iJKlmn1o","6CD"));
        System.out.println(solution("ppprrrogrammers","pppp"));
        System.out.println(solution("AbcAbcA","AAA"));
    }
    public static int solution(String str1, String str2) {
        int answer = 2;
        String str3=str1.replaceAll(str2,"");
        if(!str1.equals(str3)){
            answer=1;
        }
        return answer;
    }
}
