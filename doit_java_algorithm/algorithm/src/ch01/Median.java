package ch01;

import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        else if (a >= c) {
            return a;
        } else if (b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세 수의 중앙 값 구하기");
        System.out.print("a의 값 : ");
        int a= sc.nextInt();
        System.out.print("b의 값 : ");
        int b =sc.nextInt();
        System.out.print("c의 값 : ");
        int c= sc.nextInt();
        System.out.println("세 수의 중앙 값은 "+med3(a,b,c) + " 입니다.");


    }
}
