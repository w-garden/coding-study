package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120885
 */
public class 이진수더하기 {
    public static void main(String[] args) {
        System.out.println(solution("10","11"));
        System.out.println(solution("1001","1111"));
    }
    public static String solution(String bin1, String bin2) {
        return  Integer.toBinaryString(Integer.valueOf(bin1,2)+Integer.valueOf(bin2,2));
    }
}
