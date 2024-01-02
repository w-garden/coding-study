package ch01.quiz;

import java.util.Scanner;

//가우스의 덧셈을 사용해서 1부터 n까지의 정수 합을 구하시오
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가우스의 덧셈으로 1부터 n까지의 정수 합구하기");
        System.out.println("1 ~ N까지의 합 : ( ( 1 + N ) * N ) / 2");
        int n = sc.nextInt();
        System.out.println((1 + n) * n / 2);
    }
}
