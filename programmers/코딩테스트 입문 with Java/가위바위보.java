package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120839
 */
public class 가위바위보 {
    public static void main(String[] args) {
        System.out.println(solution("2"));
        System.out.println(solution("205"));
    }
    public static String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length();i++){
            switch (rsp.charAt(i)){
                case '2':
                    answer+="0";
                    break;
                case '0':
                    answer+="5";
                    break;
                case '5':
                    answer+="2";
            }
        }
        return answer;
    }
}
