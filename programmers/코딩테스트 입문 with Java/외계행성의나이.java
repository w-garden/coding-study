/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120834
 */
public class 외계행성의나이 {
    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(51));
        System.out.println(solution(100));
    }

    public static String solution(int age) {
        String answer = "";
        String str = Integer.toString(age);
        for (int i = 0; i < str.length(); i++) {
            answer+=(char)(str.charAt(i)+49);
        }
        return answer;
    }
}
