package ch01.quiz;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (true) {
            a = sc.nextInt();
            if (a <= 0)
                System.out.println("양의 정수를 입력하세요");
            else
                break;
        }
        System.out.println(String.valueOf(a).length());
    }
}

