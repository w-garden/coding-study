import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//나눗셈 연산 분배 법칙
//(A + B) % N = ((A % N) + (B % N)) % N
//(120 + 3) % 13 = ((120 % 13) + (3 % 13)) % 13
public class Bronze5_14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        long result = 0;

        for (int i = 0; i < num.length(); i++)
            result = ((result) * 10 + (num.charAt(i) - 48)) % 20000303;

        System.out.println(result);
    }
}
