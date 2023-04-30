package 코딩테스트입문;

/**
 * school.programmers.co.kr/learn/courses/30/lessons/120816
 */

public class 피자나눠먹기3 {
    public static void main(String[] args) {
        System.out.println(solution(7,10));
        System.out.println(solution(4,12));
        System.out.println(solution(2,3));
    }
    public static int solution(int slice, int n){
        int answer =1;
        for(int i=1; i<n+1;i++){
            if(slice*i>=n){
                answer=i;
                break;
            }
        }
        return answer;
    }
}

