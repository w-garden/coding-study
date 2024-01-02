package ch01.quiz;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정사각형을 출력합니다");
        System.out.print("변의 길이 : ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("*".repeat(a));
        }

    }
}
