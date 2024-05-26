import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2609
public class Bronze1_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String[] numArr = br.readLine().split(" ");
        int maxNumber = Math.max(Integer.parseInt(numArr[0]), Integer.parseInt(numArr[1]));
        int minNumber = Math.min(Integer.parseInt(numArr[0]), Integer.parseInt(numArr[1]));
        int GCD = getGcd(maxNumber, minNumber);

        System.out.println(GCD);
        int LCM = maxNumber * minNumber / GCD;
        System.out.println(LCM);

    }

    private static int getGcd(int maxNumber, int minNumber) {
        if (maxNumber % minNumber == 0) {
            return minNumber;
        }
        return getGcd(minNumber, maxNumber % minNumber);
    }
}
