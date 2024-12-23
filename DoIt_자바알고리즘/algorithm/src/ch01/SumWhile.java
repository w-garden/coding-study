package ch01;

import java.util.Scanner;

// 1~10 까지의 합은 (1 + 10) * 5 로 구할 수 있다 -> 가우스의 덧셈
public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구하기");
        System.out.print("n값 : ");
        int n = sc.nextInt();
        int cnt = n;
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println("1부터 " + cnt + "까지의 합은 " + sum + "입니다");
    }
}
