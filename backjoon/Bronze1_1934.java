import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
https://www.acmicpc.net/problem/1934
최소공배수
 */
public class Bronze1_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            int max = Math.max(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
            int min = Math.min(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
            for (int j = min; j > 1; j--) {
                if (max % j == 0 && min % j == 0) {
                    max /= j;
                    break;
                }
            }
            System.out.println(max * min);
        }
    }
}
