package ch01;

import java.util.Scanner;

/**
 * for 문을 n / w 번만 실행
 */
public class PrintStars2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, w;

        System.out.println("*개를 n개 출력하되 w개마다 줄을 바꿔서 출력하기");

        do {
            System.out.print("n값 : ");
            n = sc.nextInt();
        } while (n <= 0);

        do {
            System.out.print("w값 : ");
            w = sc.nextInt();
        } while (w <= 0 || w > n);


        for (int i = 0; i < n / w; i++)
            System.out.println("*".repeat(w));

        int rest = n % w;
        if (rest != 0)
            System.out.println("*".repeat(rest));
    }
}
