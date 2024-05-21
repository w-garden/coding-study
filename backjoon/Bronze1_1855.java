import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1855
public class Bronze1_1855 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String encodedStr = br.readLine();
        int columnCount = encodedStr.length() / count;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            for (int j = 1; j <= columnCount; j++) {
                if (j % 2 == 1)
                    sb.append(encodedStr.charAt(((j - 1) * count) + i));
                else
                    sb.append(encodedStr.charAt(((j - 1) * count) + (count - i) - 1));
            }
        }
        System.out.print(sb);
    }
}
