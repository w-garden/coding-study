package ch06;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static int cnt = 0;

    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min])
                    min = j;

            swap(a, i, min);
        }
    }

    static void swap(int[] a, int idx1, int idx2) {
        Utils.swap(a, idx1, idx2);
        cnt++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("선택 정렬");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] a = new int[nx];


        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        selectionSort(a, nx);
        System.out.println("오름차순으로 정렬 완료, 패스의 비교 횟수 : " + cnt);
        System.out.println(Arrays.toString(a));

    }
}
