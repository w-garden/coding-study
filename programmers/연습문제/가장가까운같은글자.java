package 연습문제;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/142086?language=java
 */

import java.util.HashMap;
import java.util.Map;

public class 가장가까운같은글자 {
    public static void main(String[] args) {
        System.out.println(solution("banana"));
        System.out.println(solution("foobar"));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> char_map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (char_map.containsKey(s.charAt(i)))
                answer[i] = i - char_map.get(s.charAt(i));
            else
                answer[i] = -1;
            char_map.put(s.charAt(i), i);
        }
        return answer;
    }
}
