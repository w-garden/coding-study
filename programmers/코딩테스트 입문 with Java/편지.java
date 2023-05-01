package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120898
 */
public class 편지 {
    public static void main(String[] args) {
        System.out.println(solution("happy birthday!"));
        System.out.println(solution("I love you~"));
    }
    public static int solution(String message){
        return message.length()*2;
    }
}
