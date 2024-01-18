import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.round;

public class Bronze_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            int overCount = 0;
            String[] str = br.readLine().split(" ");
            int total = 0;
            int studentCount = Integer.parseInt(str[0]);
            for (int j = 1; j <= studentCount; j++)
                total += Integer.parseInt(str[j]);
            int average = total / studentCount;
            for (int j = 1; j <= studentCount; j++) {
                if (Integer.parseInt(str[j]) > average)
                    overCount++;
            }
            double result = round(((overCount*1000000) / studentCount)/(float)10);
            System.out.println(String.format("%.3f", result/(float)1000) + "%");
        }
    }
}
