package 코딩테스트입문;

/**
 * school.programmers.co.kr/learn/courses/30/lessons/120831
 */
public class 짝수의합 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(4));
    }
    public static int solution(int n){
        int answer=0;
        for(int i=2; i<=n;i+=2){
            answer+=i;
        }
        return answer;
    }
}
