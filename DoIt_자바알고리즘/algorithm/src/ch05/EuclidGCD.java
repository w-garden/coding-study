package ch05;

import java.util.Scanner;
//기원전 300년경 유클리드의 원론에 기록된 유클리드 호제법
public class EuclidGCD {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            //a 보다 b가 크면 a를 반환, 그렇지 않으면 a를 b로 나눈 나머지를 반환
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다");

        System.out.printf("정수를 입력하세요: ");
        int a = sc.nextInt();
        System.out.printf("정수를 입력하세요: ");
        int b = sc.nextInt();

        System.out.println("최대 공약수는 " + gcd(a, b) + "입니다");

        System.out.println(8 % 22);
        System.out.println(22 % 8);
    }

}
