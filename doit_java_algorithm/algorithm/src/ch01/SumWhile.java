package ch01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구하기");
        System.out.print("n값: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum+=n;
            n--;
        }
        System.out.println("1부터 n까지의 합은 "+sum+"입니다");
    }
}
