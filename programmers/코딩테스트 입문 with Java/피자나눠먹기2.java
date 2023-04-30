package 코딩테스트입문;

/**
 * school.programmers.co.kr/learn/courses/30/lessons/120815
 */
public class 피자나눠먹기2 {
    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(10));
        System.out.println(solution(4));
        System.out.println(solution(7));
    }
    public static int solution(int n) {
        int answer = 0;
        for(int i=1;i<Math.max(n,6)+1;i++){
            if(6*i%n==0){
                answer=i;
                break;
            }
        }
        return answer;
    }
}
