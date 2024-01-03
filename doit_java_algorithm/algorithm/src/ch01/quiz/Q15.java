package ch01.quiz;

/**
 * n단의 피라미드 출력하기
 */
public class Q15 {
    public static void main(String[] args) {
        spira(3);
        spira(4);
        spira(5);
    }

    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--)
                System.out.print(" ");
            for (int j = 0; j < (i - 1) * 2 + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
