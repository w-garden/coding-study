package ch03;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numArr = new int[num];

        int result = -1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            numArr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        sb.append("  | ");
        for (int i = 0; i < num; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb + "\n--|--------------------");


        for (int i = 0; i < num; i++) {
            System.out.print("  | ");
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.print("*\n" + i + " |");

            if (numArr[i] == key) {
                result = i;
                break;
            }
            for (int j = 0; j < num; j++) {
                System.out.print(" " + numArr[j]);
            }

            System.out.println();
            if (i < num - 1) {
                System.out.println("  |");
            }

        }
        if (result == -1) {
            System.out.println("값 " + key + "은 조회되지 않았습니다.");
        } else {
            for (int j = 0; j < num; j++) {
                System.out.print(" " + numArr[j]);
            }
            System.out.println();
            System.out.println("그 값은 x[" + result + "] 에 있습니다.");
        }
    }
}
