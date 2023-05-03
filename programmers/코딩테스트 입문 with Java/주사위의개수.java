package 코딩테스트입문;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120845
 */
public class 주사위의개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,1},1));
        System.out.println(solution(new int[]{10,8,6},3));
    }
    public static int solution(int[] box, int n) {
        AtomicInteger answer = new AtomicInteger(1);
        Arrays.stream(box).forEach(i -> {
            int a= i;
            answer.updateAndGet(v -> v * (i / n));
        });
        return  answer.get();
    }
}
