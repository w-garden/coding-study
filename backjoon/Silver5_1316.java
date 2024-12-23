import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

//그룹 단어 체커
//https://www.acmicpc.net/problem/1316
public class Silver5_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < count; i++)
            result += validation(br.readLine());

        System.out.print(result);
    }

    public static int validation(String string) {
        Set<Character> set = new HashSet<>();
        char ch = string.charAt(0);
        set.add(ch);
        for (int i = 1; i < string.length(); i++) {
            if (ch == string.charAt(i))
                continue;

            ch = string.charAt(i);
            if (!set.add(string.charAt(i)))
                return 0;
        }
        return 1;
    }
}
