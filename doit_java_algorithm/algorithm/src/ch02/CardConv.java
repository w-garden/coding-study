package ch02;

import java.util.Scanner;

//입력받은 10진수를 2진수 ~ 36진수로 기수 변환하여 출력
public class CardConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] d = new char[32];
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        System.out.print("변환할 진수 입력 : ");
        int r = sc.nextInt();
        cardConv(num, r, d);

        System.out.print(d);
        System.out.println(" 입니다.");

    }

    static void cardConv(int x, int r, char d[]) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) {
            char temp = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = temp;
        }
    }
}
