package 연습문제;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        System.out.println(solution(3, 12));
        System.out.println(solution(2, 5));
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        for (int i = Math.min(n, m); i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                break;
            }
        }
        int num = Math.max(n, m);
        while (true) {
            if (num % n == 0 && num % m == 0) {
                answer[1] = num;
                break;
            }
            num++;
        }
        return answer;
    }
}
