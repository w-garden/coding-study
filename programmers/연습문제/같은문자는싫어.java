package 연습문제;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 같은문자는싫어 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
        System.out.println(solution(new int[]{1, 1, 3, 3, 0, 1}));
        System.out.println(solution(new int[]{4, 4, 4, 3, 3}));
    }

    public static int[] solution(int[] arr) {

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) != list.get(i + 1)) {
                list2.add(list.get(i));
            }
        }
        list2.add(list.get(list.size() - 1));
        return list2.stream().mapToInt(Integer::intValue).toArray();
    }
}
