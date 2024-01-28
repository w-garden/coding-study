import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://www.acmicpc.net/problem/1672
DNA해독
 */
public class Bronze1_1672 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String arr = br.readLine();
        char ch = arr.charAt(arr.length() - 1);
        for (int i = N - 2; i >= 0; i--) {
            if (ch == 'A') {
                if (arr.charAt(i) == 'A')
                    ch = 'A';
                else if (arr.charAt(i) == 'G')
                    ch = 'C';
                else if (arr.charAt(i) == 'C')
                    ch = 'A';
                else if (arr.charAt(i) == 'T')
                    ch = 'G';
            } else if (ch == 'G') {
                if (arr.charAt(i) == 'A')
                    ch = 'C';
                else if (arr.charAt(i) == 'G')
                    ch = 'G';
                else if (arr.charAt(i) == 'C')
                    ch = 'T';
                else if (arr.charAt(i) == 'T')
                    ch = 'A';
            } else if (ch == 'C') {
                if (arr.charAt(i) == 'A')
                    ch = 'A';
                else if (arr.charAt(i) == 'G')
                    ch = 'T';
                else if (arr.charAt(i) == 'C')
                    ch = 'C';
                else if (arr.charAt(i) == 'T')
                    ch = 'G';
            } else if (ch == 'T') {
                if (arr.charAt(i) == 'A')
                    ch = 'G';
                else if (arr.charAt(i) == 'G')
                    ch = 'A';
                else if (arr.charAt(i) == 'C')
                    ch = 'G';
                else if (arr.charAt(i) == 'T')
                    ch = 'T';
            }
        }
        System.out.println(ch);

    }
}
