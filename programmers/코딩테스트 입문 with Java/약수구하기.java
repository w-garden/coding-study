package 코딩테스트입문;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120897
 */
public class 약수구하기 {
    public static void main(String[] args) {
        System.out.println(solution(24));
        System.out.println(solution(29));
    }

    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                list.add(i);
            }
        }
        return list.stream().mapToInt(i ->i).toArray();
    }
}
