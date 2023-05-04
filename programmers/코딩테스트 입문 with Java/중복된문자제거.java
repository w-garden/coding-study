package 코딩테스트입문;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120888
 */
public class 중복된문자제거 {
    public static void main(String[] args) {
        System.out.println(solution("people"));
        System.out.println(solution("We are the world"));
    }
    public static String solution(String my_string) {
        Set<String> set = new HashSet<>();
        List<String> list =new ArrayList<>(Arrays.asList(my_string.split("")));
        StringBuilder sb= new StringBuilder();
        for (String s : list) {
            if(!set.contains(s)){
                set.add(s);
                sb.append(s);
            }
        }
        return sb.toString();
    }
}
