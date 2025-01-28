package ch05;

import java.util.Scanner;

public class RecurMemo {
    static String[] memo;

    static void recur(int n) {
        if (memo[n + 1] != null)
            System.out.print(memo[n + 1]);
        else {
            if (n > 0) {
                recur(n - 1);
                System.out.println(n);
                recur(n - 2);
                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];
            } else {
                memo[n + 1] = "";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int n = sc.nextInt();
        memo = new String[n + 2];

        recur(n);
    }
}

