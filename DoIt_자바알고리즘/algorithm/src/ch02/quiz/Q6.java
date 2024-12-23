package ch02.quiz;

import java.util.Scanner;

//기수 변환 과정 자세히 나타내는 프로그램 작성하기
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int d = 0;
        System.out.println("10진수를 기수 변환합니다");


        do {
            System.out.print("변환하는 음이 아닌 정수 : ");
            num = sc.nextInt();
        } while (num < 0);

        do {
            System.out.print("어떤 진수로 변환 할까요? (2 ~ 36) : ");
            d = sc.nextInt();
        } while (d < 2 || d > 36);

        char[] result = new char[32];
        cardConv(num, d, result);
        System.out.print(d+"진수로는 ");
        System.out.print(result);
        System.out.println(" 입니다.");
    }

    public static void cardConv(int num, int d, char[] result) {
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.printf(String.format("%%2d | %%%dd\n", 8), d, num);

        int digit = 0;
        do {
            System.out.println("   + ----------");

            result[digit] = dchar.charAt(num % d);
            if (num / d != 0) {
                System.out.printf(String.format("%%2d | %%%dd  ... %%d\n", 8), d, num / d, num % d);
            } else {
                System.out.printf(String.format("     %%%dd  ... %%d\n", 8), num / d, num % d);

            }
            result[digit++] = dchar.charAt(num % d);

            num /= d;

        } while (num > 0);

        for (int i = 0; i < digit / 2; i++) {
            char temp = result[i];
            result[i] = result[digit - i - 1];
            result[digit - i - 1] = temp;
        }
    }

}
