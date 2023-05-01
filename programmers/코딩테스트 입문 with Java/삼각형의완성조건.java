package 코딩테스트입문;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120889
 */

//가장 긴변의 길이는 다른 두변의 합보다 작다
public class 삼각형의완성조건 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3}));
        System.out.println(solution(new int[]{3,6,2}));
        System.out.println(solution(new int[]{199,72,222}));
    }
    public static int solution(int[] sides){
        int answer=2;
        Arrays.sort(sides);
        if(sides[2]<sides[0]+sides[1]){
            answer=1;
        }
        return answer;
    }
}
