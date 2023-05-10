package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120878
 */
public class 유한소수판별하기 {
    public static void main(String[] args) {
        System.out.println(solution(7, 20));
        System.out.println(solution(11, 22));
        System.out.println(solution(12, 21));
        System.out.println(solution(10, 20));
        System.out.println(solution(1, 3));
        System.out.println(solution(1, 100));
        System.out.println(solution(1, 512));
    }

    public static int solution(int a, int b) {
        // 1. 기약 분수로 만들기
        for (int i = Math.min(a, b); i > 2; i--) {
            if (a % i == 0 && b % i == 0) {
                int gcd = i;
                a /= gcd;
                b /= gcd;
            }
        }
        //2.분모의 소인수가 2,5만 존재해야함
        while (b > 1) {
            for (int i = 2; i <= b; i++) {
                if (b % i == 0) {
                    if (i != 2 && i != 5) return 2;
                    else  b /= i;
                    break;
                }
            }
        }
        return 1;
    }
}
