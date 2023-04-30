package 코딩테스트입문;

/**
 * school.programmers.co.kr/learn/courses/30/lessons/120829
 */
public class 각도기 {
    public static void main(String[] args) {
        System.out.println(solution(70));
        System.out.println(solution(91));
        System.out.println(solution(180));
    }
    public static int solution(int angle){
        int answer=4;
        if(angle<90){
            answer=1;
        } else if (angle==90) {
            answer=2;
        } else if (angle<180) {
            answer=3;
        }
        return answer;
    }
}
