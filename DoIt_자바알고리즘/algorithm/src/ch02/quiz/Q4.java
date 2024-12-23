package ch02.quiz;

import java.util.Arrays;
import java.util.Scanner;

// 배열 b의 모든 요소를 배열 a에 복사하는 copy 메서드 작성
//  System.arraycopy(a, 0, x, 0, a.length); 사용
public class Q4 {
    static String copy(int[] a) {
        int[] x = new int[a.length];
        System.arraycopy(a, 0, x, 0, a.length);
        return Arrays.toString(x);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] x = new int[num];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println(copy(x));
    }
}
