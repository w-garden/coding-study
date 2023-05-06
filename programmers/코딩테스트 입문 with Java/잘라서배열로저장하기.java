package 코딩테스트입문;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120913
 */
public class 잘라서배열로저장하기 {
    public static void main(String[] args) {
        System.out.println(solution("abc1Addfggg4556b", 6));
        System.out.println(solution("abcdef123", 3));
    }

    public static String[] solution(String my_str, int n) {
        int num1 = my_str.length() / n;
        int num2 = my_str.length() % n;
        if(num2!=0){
            num2=1;
        }
        String[] answer = new String[num1+num2];

        for (int i = 0; i <= num1; i++) {
            if (i == num1 && num2 != 0) {
                answer[i]=my_str.substring(i * n);
            }
            if (i != num1) {
                answer[i]=my_str.substring(i * n, n * (i + 1));
            }
        }
        return answer;
    }
}
