package 연습문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12919
 */
public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));
    }
    public static String solution(String[] seoul) {
        List<String> list = new ArrayList<>(Arrays.asList(seoul));
        return  "김서방은 " + list.indexOf("Kim") + "에 있다";
    }
}
