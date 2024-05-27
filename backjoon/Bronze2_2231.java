import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze2_2231 {
    //분해합
    //https://www.acmicpc.net/problem/2231
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        int answer = 0;

        int startNumber = number - (String.valueOf(number).length() * 9);
        for (int i = startNumber; i <= number; i++) {

            int result = i;
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                int a = String.valueOf(i).charAt(j) - 48;
                result += a;
            }
            if (result == number) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
