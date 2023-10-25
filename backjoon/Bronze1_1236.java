import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze1_1236 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());
        char[][] castle = new char[height][width];
        int minRowCnt = 0;
        int minColCnt = 0;
        for (int i = 0; i < height; i++) {
            sb.delete(0, sb.length());
            sb.append(br.readLine());
            for (int j = 0; j < width; j++) {
                castle[i] = sb.toString().toCharArray();
            }
            if (!sb.toString().contains("X")) {
                minRowCnt++;
            }
        }
        for (int i = 0; i < width; i++) {
            sb.delete(0, sb.length());
            for (int j = 0; j < height; j++) {
                sb.append(castle[j][i]);
            }
            if (!sb.toString().contains("X")) {
                minColCnt++;
            }
        }
        System.out.println(Math.max(minRowCnt, minColCnt));
    }
}
