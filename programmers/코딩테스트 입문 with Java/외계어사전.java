package 코딩테스트입문;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120869
 */
public class 외계어사전 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }

    public static int solution(String[] spell, String[] dic) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        String[] str;
        Arrays.sort(spell);
        for (String s : dic) {
            if (s.length() == spell.length) {
                list.add(s);
            }
            str = s.split("");
            Arrays.sort(str);
            if (Arrays.equals(str, spell)) {
                answer++;
            }
        }
        if (answer == 0) {
            answer = 2;
        }
        return answer;
    }
}
