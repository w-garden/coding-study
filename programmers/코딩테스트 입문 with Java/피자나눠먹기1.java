package 코딩테스트입문;

/**
 * school.programmers.co.kr/learn/courses/30/lessons/120814
 */
public class 피자나눠먹기1 {
    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(1));
        System.out.println(solution(15));
    }
    public static int solution(int n) {
        int answer = 0;
        answer+=n/7;
        if(n%7!=0){
            answer++;
        }
        return answer;
    }
}
