package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120818
 */
public class 옷가게할인받기 {
    public static void main(String[] args) {
        System.out.println(solution(150000));
        System.out.println(solution(580000));
    }
    public static int solution(int price) {
        int answer = price;
        if(price>=500000){
            answer= (int) (price*0.8);
        } else if (price>=300000) {
            answer= (int) (price*0.9);
        } else if (price>=100000) {
            answer= (int) (price*0.95);
        }
        return answer;
    }
}
