package 코딩테스트입문;


/**
 * school.programmers.co.kr/learn/courses/30/lessons/120822
 */
public class 문자열뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution("jaron"));
        System.out.println(solution("bread"));
        System.out.println(solution2("jaron"));
        System.out.println(solution2("bread"));
    }
    public static String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length();i++){
            int num =my_string.length()-1-i;
            answer+=my_string.substring(num,num+1);
        }
        return answer;
    }
    public static String solution2(String my_string){
        StringBuilder sb= new StringBuilder();
        sb.append(my_string);
        sb.reverse();
        return sb.toString();
    }
}
