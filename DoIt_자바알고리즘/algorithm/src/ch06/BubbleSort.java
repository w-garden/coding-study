package ch06;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static int cnt = 0;


    static void bubbleSort(int[] a, int n) {
        cnt++;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--)
                if (a[j - 1] > a[j])
                    Utils.swap(a, j - 1, j);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(버전1)");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] a = new int[nx];


        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        bubbleSort(a, nx);
        System.out.println("오름차순으로 정렬 완료, 패스의 비교 횟수 : " + cnt);
        System.out.println(Arrays.toString(a));

    }
}
