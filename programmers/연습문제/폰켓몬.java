package 연습문제;

import java.util.HashSet;
import java.util.Set;

/**
 * 1. n마리의 포켓몬중 N/2마리는 가져가도됨
 * 2. 폰켓몬은 종류에따라 번호를 붙여 구분 = 같은종류는 같은 번호
 */
public class 폰켓몬 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 3}));
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 2}));
    }

    public static int solution(int[] nums) {
        int answer = nums.length / 2;
        Set<Integer> phoneketmon = new HashSet<>();
        for (int n : nums)
            phoneketmon.add(n);
        if (phoneketmon.size() < answer)
            answer = phoneketmon.size();
        return answer;
    }
}
