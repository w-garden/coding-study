package 연습문제;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */
public class 하샤드수 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }

    public static boolean solution(int x) {
        int n1 = x;
        int n2 = 0;
        while (n1 > 0) {
            n2 += n1 % 10;
            n1 /= 10;
        }
        if (x % n2 == 0)
            return true;

        return false;
    }
}
