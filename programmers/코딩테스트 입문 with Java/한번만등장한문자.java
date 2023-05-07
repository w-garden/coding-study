package 코딩테스트입문;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120896
 */
public class 한번만등장한문자 {
    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));
        System.out.println(solution("abdc"));
        System.out.println(solution("hello"));
        System.out.println(solution("aaa"));
        System.out.println(solution("zzaadc"));
        System.out.println(solution("zadc"));
        System.out.println(solution("baaaab"));
        System.out.println(solution("baaaa"));
        System.out.println(solution("baaaa"));
    }

    public static String solution(String s) {
        String str="";
        while (s.length() != 0) {
            int cnt =0;
            for (int i = 0; i < s.length(); i++) {
               if(s.charAt(0)==s.charAt(i)){
                   cnt++;
               }
            }
            if(cnt==1){
                str+=s.charAt(0);
            }
            s=s.replace(String.valueOf(s.charAt(0)),"");
        }
        char[] chars= str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
