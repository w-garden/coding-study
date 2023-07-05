package 연습문제;

public class 소수만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
        System.out.println(solution(new int[]{1, 2, 7, 6, 4}));
        System.out.println(solution(new int[]{1, 2, 4}));
    }

    public static int solution(int[] nums) {
        int answer = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    num = nums[i] + nums[j] + nums[k];
                    for (int h = num - 1; h > 0; h--) {
                        if (num % h == 0) {
                            if (h == 1)
                                answer++;
                            break;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
