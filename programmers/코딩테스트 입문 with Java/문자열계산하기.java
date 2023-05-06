package 코딩테스트입문;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120902
 */
public class 문자열계산하기 {
    public static void main(String[] args) {
        System.out.println(solution("3 + 4"));
        System.out.println(solution("3 + 4 + 10"));
        System.out.println(solution("3 + 4 - 10"));
    }

    public static int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length - 1; i += 2) {
            switch (arr[i]) {
                case "+":
                    answer += Integer.parseInt(arr[i + 1]);
                    break;
                case "-":
                    answer -= Integer.parseInt(arr[i + 1]);
            }
        }
        return answer;
    }
}
