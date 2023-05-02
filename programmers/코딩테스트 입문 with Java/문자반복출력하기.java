package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120825
 */
public class 문자반복출력하기 {
    public static void main(String[] args) {
        System.out.println(solution("hello",3));
        System.out.println(solution("h",1));
    }
    public static String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<my_string.length();i++){
            for (int j=0; j<n;j++){
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }
}
