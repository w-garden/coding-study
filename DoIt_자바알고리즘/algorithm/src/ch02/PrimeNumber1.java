package ch02;

//1000 이하의 소수를 나열하기
public class PrimeNumber1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            int j;
            for (j = 2; j < i; j++) {
                count++;
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(i);
            }
        }
        System.out.println("나눗셈을 수행한 횟수 : " + count);
    }

}
