package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120892
 */
public class 암호해독 {
    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk",4));
        System.out.println(solution("pfqallllabwaoclk",2));
    }
    public static String solution(String cipher, int code) {
        String answer = "";
        for(int i=code-1; i<cipher.length();i+=code){
            answer+=cipher.charAt(i);
        }
        return answer;
    }
}
