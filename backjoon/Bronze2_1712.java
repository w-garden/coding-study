import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.OptionalLong;
import java.util.stream.LongStream;

//최초로 총 수입이 총 비용보다 많아지는가? -> 판매량 출력
public class Bronze2_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        final long fixedCost = Long.parseLong(input[0]);
        final long variableCost = Long.parseLong(input[1]);
        final long laptopPrice = Long.parseLong(input[2]);
        long result = -1;

        if (variableCost < laptopPrice) {
            OptionalLong first = LongStream.iterate(1, x -> x + 1)
                    .filter(x -> fixedCost + (variableCost * x) < laptopPrice * x)
                    .findFirst();
            result = first.isPresent() ? first.getAsLong() : 0;
        }
        System.out.println(result);
    }
}
