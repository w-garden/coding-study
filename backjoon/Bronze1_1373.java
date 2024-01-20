import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.remainderUnsigned;
import static java.lang.String.*;

/*
2진수 8진수
첫째 줄에 2진수가 주어진다.
주어지는 수의 길이는 1,000,000을 넘지 않는다.

2진수에서 -> 10진수 변환 후 -> 8진수 변환

 */
public class Bronze1_1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        BigInteger binaryNum = new BigInteger(str, 2);

        System.out.println(binaryNum.toString(8));
    }
}
