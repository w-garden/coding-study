package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120906
 */
public class 자릿수더하기 {
    public static void main(String[] args) {
        System.out.println(solution(1234));
        System.out.println(solution(930211));
    }
    public static int solution(int n) {
        int answer = 0;
        while (n>0){
            answer+=(n%10);
            n/=10;
        }
        return answer;
    }
}
