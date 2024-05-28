package ch02.quiz;

import java.util.Arrays;

public class Q2 {
    static void swap(int[] a, int idx1, int idx2) {
        System.out.println(Arrays.toString(a));
        System.out.println("a["+idx1+"]과 a["+idx2+"]을 교환 합니다.");
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        int[] x = new int[]{2, 5, 1, 3, 9, 6, 7};
        reverse(x);
        System.out.println(Arrays.toString(x));
        System.out.println("역순 정렬을 마쳤습니다.");

    }

}
