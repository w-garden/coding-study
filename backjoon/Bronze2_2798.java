import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Bronze2_2798 {
    //블랙잭
    //https://www.acmicpc.net/problem/2798
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String[] strArr = br.readLine().split(" ");
        int maxNumber = Integer.parseInt(strArr[1]);
        int cardCount = Integer.parseInt(strArr[0]);

        String[] strArr2 = br.readLine().split(" ");
        int[] cardNumberArr = Stream.of(strArr2).mapToInt(Integer::parseInt).toArray();
        int answer = getResultNumber(cardCount, cardNumberArr, maxNumber);
        System.out.println(answer);
    }

    private static int getResultNumber(int cardCount, int[] cardNumberArr, int maxNumber) {
        int answer = 0;
        for (int i = 0; i < cardCount; i++) {
            if (cardNumberArr[i] >= maxNumber) {
                continue;
            }
            for (int j = 1 + i; j < cardCount; j++) {
                if (cardNumberArr[i] + cardNumberArr[j] >= maxNumber) {
                    continue;
                }
                for (int k = j + 1; k < cardCount; k++) {
                    int num = cardNumberArr[i] + cardNumberArr[j] + cardNumberArr[k];
                    if (num <= maxNumber && num > answer) {
                        answer = num;
                    }
                }
            }
        }
        return answer;
    }

}
