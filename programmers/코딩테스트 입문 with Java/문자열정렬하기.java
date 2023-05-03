package 코딩테스트입문;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120850
 */
public class 문자열정렬하기 {
    public static void main(String[] args) {

        System.out.println(solution("hi12392"));
        System.out.println(solution("p2o4i8gj2"));
        System.out.println(solution("abcde0"));
    }
    public static int[] solution(String my_string) {
        String str= my_string.replaceAll("[^0-9]","");
        int[] answer=new int[str.length()];
        for(int i=0; i<str.length();i++){
            answer[i]=str.charAt(i)-48;
        }
        Arrays.sort(answer);
        return answer;
    }
}
