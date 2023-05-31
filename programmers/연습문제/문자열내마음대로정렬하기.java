package 연습문제;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"sun", "bed", "car"}, 1));
        System.out.println(solution(new String[]{"abce", "abcd", "cdx"}, 2));
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num = o1.charAt(n) - o2.charAt(n);
                if (num == 0)
                    return o1.compareTo(o2);
                return num;
            }
        });
        return strings;
    }
}
