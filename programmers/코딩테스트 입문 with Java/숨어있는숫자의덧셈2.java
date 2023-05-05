package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120864
 */

public class 숨어있는숫자의덧셈2 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123Z"));
    }
    public static int solution(String my_string) {
        int answer = 0;
        my_string=my_string.replaceAll("[^0-9]"," ");
        for (String o : my_string.split(" ")) {
            if (!o.equals("")){
                answer += Integer.parseInt(o);
            }
        }
        return answer;
    }
}
