package 코딩테스트입문;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120907
 */
public class OX퀴즈 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"3 + -4 = -3"}));
        System.out.println(solution(new String[]{"3 + -6 = -3"}));
        System.out.println(solution(new String[]{"3 - -6 = -9"}));
        System.out.println(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"}));
        System.out.println(solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"}));
    }

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] arr=quiz[i].split(" ");
            int num=0;
            switch (arr[1]){
                case "+":
                    num=Integer.parseInt(arr[0])+Integer.parseInt(arr[2]);
                    break;
                case "-":
                    num=Integer.parseInt(arr[0])-Integer.parseInt(arr[2]);
            }
            if(num==Integer.parseInt(arr[arr.length-1])){
                answer[i]="O";
            }
            else {
                answer[i]="X";
            }
        }
        return answer;
    }
}
