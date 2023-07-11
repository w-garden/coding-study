package 연습문제;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}));
        System.out.println(solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25}));
        System.out.println(solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35}));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> lottos_list = Arrays.stream(lottos).boxed().collect(Collectors.toList());
        List<Integer> win_nums_list = Arrays.stream(win_nums).boxed().collect(Collectors.toList());
        int num = Collections.frequency(lottos_list, 0);
        int min = 7;
        for (Integer i : lottos_list) {
            if (win_nums_list.contains(i)) {
                win_nums_list.remove(i);
                min--;
            }
        }
        if (min == 7)
            min--;
        if (num - win_nums_list.size() > 0)
            num -= win_nums_list.size();
        if (min - num == 0) {
            num--;
        }
        return new int[]{min - num, min};
    }
}
