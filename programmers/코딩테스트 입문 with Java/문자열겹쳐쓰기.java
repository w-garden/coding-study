package 코딩기초트레이닝;

/**
 * school.programmers.co.kr/learn/courses/30/lessons/181943
 */
public class 문자열겹쳐쓰기 {
    public static void main(String[] args) {
        System.out.println(solution("He11oWor1d",	"lloWorl",2));
        System.out.println(solution("Program29b8UYP",	"merS123",7));
    }
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i=0; i<my_string.length();i++){
            if(i==s){
                for(int j=0; j<overwrite_string.length();j++){
                    answer+=overwrite_string.charAt(j);
                    i++;
                }
            }
            if(i<my_string.length()) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
