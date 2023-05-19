package 연습문제;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12930
 */
public class 이상한문자만들기 {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
        System.out.println(solution("hello"));
        System.out.println(solution("a a"));
        System.out.println(solution("a a a a a aa"));
        System.out.println(solution("aaa aaa aaa aa aaaa aa"));
        System.out.println(solution("world"));
        System.out.println(solution("  tRy hello  WORLD    "));
        System.out.println(solution("try hello            world"));
        System.out.println(solution(" a aAAA    a a  "));
        System.out.println(solution(" a aAAA    a a  "));
        System.out.println(solution("abc abcd abcde"));

    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean check=true;
        for (int i = 0; i < s.length(); i++) {
            String str=String.valueOf(s.charAt(i));
            if(str.equals(" ")){
                sb.append(str);
                check=true;
                continue;
            }
            if(check){
                sb.append(str.toUpperCase());
                check=false;
            }
            else {
                sb.append(str.toLowerCase());
                check=true;
            }
        }
        return sb.toString();
    }
}
