package 코딩기초트레이닝;

import java.util.Scanner;

public class 덧셈식출력하기 {
    /**
     * school.programmers.co.kr/learn/courses/30/lessons/181947
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a + " + " + b + " = " + (a + b));
    }
}
