package ch06;

import java.util.Arrays;
import java.util.Scanner;

//하나의 패스가 마쳤을 때 last값을 k에 대입하여 다음에 수행할 패스의 범위를 제한한다
public class BubbleSort3 {
    static int cnt = 0;

    static void swap(int[] a, int idx1, int idx2) {
        Utils.swap(a, idx1, idx2);
        cnt++;
    }

    static void bubbleSort(int[] a, int n) {
        int k = 0;
        while (k < n - 1) {
            int last = n - 1;
            for (int j = n - 1; j > k; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                }
            }
            k = last;


        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(버전3)");
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
