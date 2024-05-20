import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze1_1816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Long[] longArr = new Long[count];

        for (int i = 0; i < count; i++) {
            longArr[i] = Long.valueOf(br.readLine());
            String result = "YES";
            int maxPrimeFactor = 1000000;
            long s = longArr[i];
            for (int j = 2; j <= maxPrimeFactor; j++) {
                if (s % j == 0) {
                    result = "NO";
                    break;
                }
            }
            System.out.println(result);
        }
    }
}

