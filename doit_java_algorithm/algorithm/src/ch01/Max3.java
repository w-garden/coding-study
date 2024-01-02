package ch01;

import java.util.Scanner;
//3개의 정숫값을 입력하고 최댓값을 구하여 출력하기
public class Max3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 수의 최댓값 구하기");

        System.out.print("a 의 값을 입력하세요 : ");
        int a = stdIn.nextInt();
        System.out.print("b 의 값을 입력하세요 : ");
        int b = stdIn.nextInt();
        System.out.print("c 의 값을 입력하세요 : ");
        int c = stdIn.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최댓값은 "+max+"입니다");
    }
}
