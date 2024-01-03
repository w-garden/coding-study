package ch01.quiz;

/**
 * 왼쪽 아래가 직각인 이등변 삼각형 출력
 */
public class Q14 {
    public static void main(String[] args) {
        triangleLB(5);
        triangleLB(3);
        triangleLB(10);
    }

    static void triangleLB(int n) {
        System.out.println(n+"단 삼각형 출력!");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }

    }
}
