package ch06;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    static int cnt = 0;

    static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n - 1; i++) {
            int j;
            int temp = a[i];
            for (j = i; j > 0 && a[j - 1] > temp; j--) {
                a[j] = a[j - 1];
            }
        }
    }

    static void swap(int[] a, int idx1, int idx2) {
        Utils.swap(a, idx1, idx2);
        cnt++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("삽입 정렬");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] a = new int[nx];


        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        insertionSort(a, nx);
        System.out.println("오름차순으로 정렬 완료 : " + cnt);
        System.out.println(Arrays.toString(a));

    }
}
