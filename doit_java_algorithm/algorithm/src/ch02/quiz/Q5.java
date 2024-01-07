package ch02.quiz;

import java.util.Arrays;
import java.util.Scanner;

//배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy작성
public class Q5 {
    static String rcopy(int[] a) {
        int[] x = new int[a.length];
        System.arraycopy(a, 0, x, 0, a.length);
        for (int i = 0; i < x.length / 2; i++)
            swap(x, i, x.length - i - 1);

        return Arrays.toString(x);

    }

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] x = new int[num];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(x));
        System.out.println(rcopy(x));
    }
}
