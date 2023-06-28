package 연습문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42576
 */
public class 완주하지못한선수 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
        System.out.println(solution(new String[]{"mislav", "mislav", "mislav", "mislav"}, new String[]{"mislav", "mislav", "mislav"}));
        System.out.println(solution(new String[]{"mislav"}, new String[]{}));
    }

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
            else if(i==completion.length-1){
                return participant[i+1];
            }
        }
        return participant[0];
    }
}
