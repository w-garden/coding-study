package ch02;

import java.util.Scanner;

/**
 * 배열 요소의 최댓값 출력(값을 입력받음)
 */
public class MaxOfArray {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("키의 최댓값 구하기");
        System.out.print("사람 수 : ");
        int num = sc.nextInt();

        int[] height = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("height[" + i + "]");
            height[i] = sc.nextInt();
        }
        System.out.println("최댓값은 " + maxOf(height) + "입니다");
    }

}

