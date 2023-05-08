package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120921
 */
public class 문자열밀기 {
    public static void main(String[] args) {
        System.out.println(solution("hello", "ohell"));
        System.out.println(solution("apple", "elppa"));
        System.out.println(solution("atat", "tata"));
        System.out.println(solution("abc", "abc"));
    }

    public static int solution(String A, String B) {
        if(A.equals(B)){
            return 0;
        }
        for (int i = 0; i < A.length(); i++) {
            A = A.substring(A.length() - 1, A.length()) + A.substring(0, A.length()-1);
            if(A.equals(B)){
                return i+1;
            }
        }
        return -1;
    }
}
