package 코딩테스트입문;

import java.util.Scanner;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120823
 */
public class 직각삼각형출력하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
