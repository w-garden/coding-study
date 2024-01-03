package ch01.quiz;

public class Q16 {
    public static void main(String[] args) {
        nspira(3);
        nspira(4);
        nspira(16);
    }

    static void nspira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--)
                System.out.print(" ");
            for (int j = 0; j < (i - 1) * 2 + 1; j++)
                System.out.print(i % 10);
            System.out.println();
        }
    }
}
