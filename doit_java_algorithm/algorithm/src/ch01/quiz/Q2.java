package ch01.quiz;

public class Q2 {
    //세 값의 최솟값을 구하는 min3 메서드를 작성하라
    public static void main(String[] args) {
        System.out.println(min3(1, 2, 3));
        System.out.println(min3(3, 2, 1));
        System.out.println(min3(2, 1, 3));
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;

    }
}
