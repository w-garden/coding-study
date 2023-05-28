package 연습문제;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12901
 */

import java.util.HashMap;
import java.util.Map;

public class 요일맞추기_2016년 {
    public static void main(String[] args) {
        System.out.println(solution(5, 24));
        System.out.println(solution(5, 25));
        System.out.println(solution(5, 26));
        System.out.println(solution(5, 27));
        System.out.println(solution(5, 28));
        System.out.println(solution(5, 29));
        System.out.println(solution(5, 30));
        System.out.println(solution(5, 31));
        System.out.println(solution(1, 1));
    }

    public static String solution(int a, int b) {

        Map<Integer, String > dayName = new HashMap<>();
        dayName.put(1,"FRI");
        dayName.put(2,"SAT");
        dayName.put(3,"SUN");
        dayName.put(4,"MON");
        dayName.put(5,"TUE");
        dayName.put(6,"WED");
        dayName.put(0,"THU");
        Map<Integer, Integer> monthlyDate = new HashMap<>();
        monthlyDate.put(1, 31);
        monthlyDate.put(2, 29);
        monthlyDate.put(3, 31);
        monthlyDate.put(4, 30);
        monthlyDate.put(5, 31);
        monthlyDate.put(6, 30);
        monthlyDate.put(7, 31);
        monthlyDate.put(8, 31);
        monthlyDate.put(9, 30);
        monthlyDate.put(10, 31);
        monthlyDate.put(11, 30);
        monthlyDate.put(12, 31);

        int date_count = b;
        for (int i = 1; i < a; i++)
            date_count += monthlyDate.get(i);

        return dayName.get(date_count%7);
    }
}
