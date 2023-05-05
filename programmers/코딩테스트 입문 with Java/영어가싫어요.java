package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120894
 */
public class 영어가싫어요 {
    public static void main(String[] args) {
        System.out.println(solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(solution("onefourzerosixseven"));
    }
    public static long solution(String numbers) {

        numbers=numbers.replace("one","1")
                .replace("two","2")
                .replace("three","3")
                .replace("four","4")
                .replace("five","5")
                .replace("six","6")
                .replace("seven","7")
                .replace("eight","8")
                .replace("nine","9")
                .replace("zero","0");

        return Long.parseLong(numbers);
    }
}
