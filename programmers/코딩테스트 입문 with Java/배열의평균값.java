package 코딩테스트입문;

/**
 * school.programmers.co.kr/learn/courses/30/lessons/120817
 *
 * 정수배열 : numbers
 * numbers 의 원소의 평균값 출력
 */
public class 배열의평균값 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(solution(new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }
    public static double solution(int[] numbers){
        double answer=0;
        for (int number : numbers) {
            answer+=number;
        }
        answer/=numbers.length;
        return answer;
    }
}
