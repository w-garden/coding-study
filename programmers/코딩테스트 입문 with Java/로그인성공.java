package 코딩테스트입문;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120883
 */

import java.util.HashMap;
import java.util.Map;

public class 로그인성공 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));
        System.out.println(solution(new String[]{"programmer01", "15789"}, new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}}));
        System.out.println(solution(new String[]{"jaja11", "98761"}, new String[][]{{"krong0313", "29440"}, {"yyoom", "1234"}, {"rabbit00", "111333"}}));
    }

    public static String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        String id = id_pw[0];
        String pw = id_pw[1];
        Map<String, String> map = new HashMap<>();
        for (String[] strings : db) {
            map.put(strings[0], strings[1]);
        }
        for (String s : map.keySet()) {
            if (map.containsKey(id)) {
                answer = "wrong pw";
                if (map.get(id).equals(pw)) {
                    answer = "login";
                }
            }
        }
        return answer;
    }
}
