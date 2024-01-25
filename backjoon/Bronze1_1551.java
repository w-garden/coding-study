import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 수열의 변화
 * https://www.acmicpc.net/problem/1551
 */
public class Bronze1_1551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] size = br.readLine().split(" ");

        int N = Integer.parseInt(size[0]);
        int K = Integer.parseInt(size[1]);

        int[] sequence = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        for (int i = 1; i <= K; i++) {
            int[] newSequence = new int[N - i];
            for (int j = 0; j < newSequence.length; j++)
                newSequence[j] = sequence[j + 1] - sequence[j];
            sequence = newSequence.clone();
        }
        for (int i : sequence) {
            if (sb.length() > 0)
                sb.append(",");
            sb.append(i);
        }
        System.out.println(sb);
    }
}
