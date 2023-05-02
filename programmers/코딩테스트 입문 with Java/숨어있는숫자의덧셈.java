package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120851
 */
public class 숨어있는숫자의덧셈 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123"));
    }
    public static int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length();i++){
            if(Character.isDigit(my_string.charAt(i))){
                answer+=(my_string.charAt(i)-48);
            }
        }
        return answer;
    }
}
