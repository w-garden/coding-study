package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/81301
 */
public class 숫자문자열과영단어 {
    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
        System.out.println(solution("23four5six7"));
        System.out.println(solution("2three45sixseven"));
        System.out.println(solution("123"));
    }

    public static int solution(String s) {
        s=s.replace("zero","0")
                .replace("one","1")
                .replace("two","2")
                .replace("three","3")
                .replace("four","4")
                .replace("five","5")
                .replace("six","6")
                .replace("seven","7")
                .replace("eight","8")
                .replace("nine","9");
        return Integer.valueOf(s);
    }
}
