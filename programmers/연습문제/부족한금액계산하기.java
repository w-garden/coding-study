package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/82612
 */
public class 부족한금액계산하기 {
    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
        System.out.println(solution(2500, 20, 2500));
    }

    public static long solution(int price, int money, int count) {
        long total=0;
        for (int i = 1; i <= count; i++) {
            total +=(price*i);
        }
        return total-money>=0?total-money:0;
    }
}
