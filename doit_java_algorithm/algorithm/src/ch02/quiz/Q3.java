package ch02.quiz;

import java.util.Scanner;

//배열 a의 모든 요소의 합계를 구하여 반환하는 메서드 작성
public class Q3 {
    static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] x = new int[num];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println(sum(x));
    }
}
