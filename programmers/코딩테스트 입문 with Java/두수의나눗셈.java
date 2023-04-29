package 코딩테스트입문;

public class 두수의나눗셈 {
    public static void main(String[] args) {
        System.out.println(solution(3,2));
        System.out.println(solution(7,3));
        System.out.println(solution(1,16));

    }
    public static int solution(int num1, int num2) {
        return (int)(((double)num1/num2)*1000);
    }
}
