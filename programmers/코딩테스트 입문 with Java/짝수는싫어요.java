package 코딩테스트입문;


/**
 * school.programmers.co.kr/learn/courses/30/lessons/120813
 */
public class 짝수는싫어요 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(15));
    }

    public static int[] solution(int n) {
        int count=0;
        if(n%2==0){
            count=n/2;
        }
        else{
            count=n/2+1;
        }
        int[] answer = new int[count];
        answer[0]=1;
        for (int i = 1; i < count; i++) {
            answer[i]=i*2+1;
        }
        return answer;
    }

}
