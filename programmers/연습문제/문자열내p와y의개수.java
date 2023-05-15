package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12916
 */
public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
    }
    public static boolean solution(String s) {
        s=s.toLowerCase();
        StringBuilder sb1= new StringBuilder(s.replace("p",""));
        StringBuilder sb2= new StringBuilder(s.replace("y",""));
        return sb1.length()==sb2.length();
    }
}
