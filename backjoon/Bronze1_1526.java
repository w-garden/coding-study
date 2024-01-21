import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
가장 큰 금민수(4,7로만 이루어진 수)
은민이는 4,7 좋아함. 나머지는 싫어함

N이 주어졌을때 N보다 작거나 같은 금민수 중 가장 큰 것 출력

 */
public class Bronze1_1526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean flag = false;
        for (int i = N; i > 0; i--) {
            char[] arr = String.valueOf(N).toCharArray();
            for (char c : arr) {
                if (c != '4' && c != '7') {
                    N--;
                    flag = false;
                    break;
                }
                flag = true;
            }
            if (flag)   break;
        }
        System.out.println(N);
    }
}
