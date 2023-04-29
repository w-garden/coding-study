package 코딩기초트레이닝;

import java.util.Scanner;

/**
 * school.programmers.co.kr/learn/courses/30/lessons/181945
 */
public class 문자열돌리기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (char s : a.toCharArray()) {
            System.out.println(s);
        }
    }
}
