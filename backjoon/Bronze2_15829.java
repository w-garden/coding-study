import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze2_15829 {
    //Hashing
    //https://www.acmicpc.net/problem/15829
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int MOD = 1234567891;
        final long r = 31;
        int strLength = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long total = 0;

        for (int i = 0; i < strLength; i++) {
            long temp = 1;

            for (int j = 0; j < i; j++)
                temp = (temp * r) % MOD;

            total += ((str.charAt(i) - 96) * temp) % MOD;
            total %= MOD;
        }
        System.out.println(total);
    }
}
