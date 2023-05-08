package 코딩테스트입문;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120956
 */
public class 옹알이1 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
        System.out.println(solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }
    public static int solution(String[] babbling) {
        int answer = 0;
        for (String str : babbling) {
            str=str
                    .replace("aya"," ")
                    .replace("ye"," ")
                    .replace("woo"," ")
                    .replace("ma"," ")
                    .trim();
            if(str.equals(""))  answer++;
        }
        return answer;
    }
}
