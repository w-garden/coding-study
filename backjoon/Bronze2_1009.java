import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//https://www.acmicpc.net/problem/1009 분산처리
public class Bronze2_1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] strArr = br.readLine().split(" ");
            List<Integer> list = new ArrayList<>();

            long a = Integer.parseInt(strArr[0]);
            long b = Integer.parseInt(strArr[1]);
            long total = 1;
            int result;

            if (a % 10 == 0) {
                System.out.println(10);
                continue;
            }

            while (true) {
                total *= a;
                int test = (int) (total % 10);
                if (list.contains(test)) {
                    break;
                }
                list.add(test);
            }

            if (list.size() == 1) {
                result = list.get(0);
            } else if (b % list.size() == 0) {
                result = list.get(list.size() - 1);
            } else {
                result = list.get((int) (b % list.size()) - 1);
            }
            System.out.println(result);
        }

    }
}
