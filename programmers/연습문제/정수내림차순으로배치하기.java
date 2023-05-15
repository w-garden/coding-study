package 연습문제;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (String s : arr)
            sb.append(s);

        return Long.valueOf(sb.toString());
    }
}
