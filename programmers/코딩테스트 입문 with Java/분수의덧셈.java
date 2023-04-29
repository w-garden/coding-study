package 코딩테스트입문;

public class 분수의덧셈 {
    public static void main(String[] args) {
        System.out.println(solution(1, 2, 3, 4));
        System.out.println(solution(9, 2, 1, 3));
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        for (int i = Math.min(numer, denom); i > 1; i--) {
            if(numer % i ==0 && denom % i ==0){
                numer/=i;
                denom/=i;
                break;
            }
        }
        answer[0] = numer;
        answer[1] = denom;
        return answer;
    }
}
