package 코딩테스트입문;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120849
 */
public class 모음제거 {
    public static void main(String[] args) {
        System.out.println(solution("bus"));
        System.out.println(solution("nice to meet you"));
    }
    public static String solution(String my_string) {
       return my_string.replaceAll("[aeiou]","");
//        return my_string.replace("a", "")
//                .replace("e","")
//                .replace("i","")
//                .replace("o", "")
//                .replace("u", "");

    }
}
