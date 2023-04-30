package 코딩테스트입문;

import java.util.Arrays;

/**
 * school.programmers.co.kr/learn/courses/30/lessons/120811
 */
public class 중앙값구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 7, 10, 11}));
        System.out.println(solution(new int[]{9,-1,0}));
    }
    public static int solution(int[] array){
        Arrays.sort(array);
        return array[array.length/2];
    }
}
