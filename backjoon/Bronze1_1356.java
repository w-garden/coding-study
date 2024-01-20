import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
유진수
어떤수를 10진수로 표현한 뒤 그 수를 두 부분으로 나눴을 때, 앞부분 자리수와 뒷부분 자리수의 곱이 같을 때를 의미

1221 => 유진수
12345 => 1-2345, 12-345, 123-45, 1234-5 로 나눌 수 있음. 유진수일까?

자연수 N은 2,147,483,647 보다는 작다
 */
public class Bronze1_1356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        String result = "NO";
        for (int i = 0; i < str.length - 1; i++) {
            int frontNum = 1;
            int backNum = 1;
            for (int j = 0; j < i + 1; j++)
                frontNum *= Integer.parseInt(str[j]);
            for (int j = i + 1; j < str.length; j++)
                backNum *= Integer.parseInt(str[j]);
            if (frontNum == backNum)
                result = "YES";
        }
        System.out.println(result);
    }
}
