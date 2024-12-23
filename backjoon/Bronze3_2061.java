import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

import static java.math.BigInteger.ZERO;
//https://www.acmicpc.net/problem/2061
//좋은 암호

public class Bronze3_2061 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        BigInteger keyNum = new BigInteger(input[0]);
        BigInteger limitNum = new BigInteger(input[1]);

        int result = 0;
        for (int i = 2; i < limitNum.intValue(); i++) {
            if (keyNum.remainder(BigInteger.valueOf(i)).compareTo(ZERO) == 0) {
                result = i;
                break;
            }
        }
        System.out.println(result == 0 ? "GOOD" : "BAD " + result);
    }
}




