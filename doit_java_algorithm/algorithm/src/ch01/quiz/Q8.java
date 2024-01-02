package ch01.quiz;

public class Q8 {
    //정수 a,b를 포함하여 그 사이의 모든 정소의 합을 구하기
    public static void main(String[] args) {
        System.out.println(sumof(1,10));
        System.out.println(sumof(1,11));
        System.out.println(sumof(9,10));
    }

    static int sumof(int a, int b) {
        int sum = b;
        for (int i = a; i < b; i++) {
            sum+=i;
        }
        return sum;
    }
}
