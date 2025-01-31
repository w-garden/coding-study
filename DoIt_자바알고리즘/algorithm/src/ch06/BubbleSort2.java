package ch06;

import java.util.Arrays;
import java.util.Scanner;

//어떤 패스에서 요소의 교환 횟수가 0번이면 더 이상 정렬할 요소가 없다는 뜻이므로 작업을 멈춘다
public class BubbleSort2 {
    static int cnt = 0;

    static void swap(int[] a, int idx1, int idx2) {
        Utils.swap(a, idx1, idx2);
        cnt++;
    }

    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            cnt++;
            int exchg = 0;
            for (int j = n - 1; j > i; j--)
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    exchg++;
                }
            if (exchg == 0) break;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(버전2)");
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
