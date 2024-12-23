import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
//https://www.acmicpc.net/problem/2712
//미국스타일
public class Bronze3_2712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Map<String, Double> weightMap = Map.of("kg", 2.2046
                , "l", 0.2642
                , "lb", 0.4536
                , "g", 3.7854);
        Map<String, String> measureMap = Map.of("kg", "lb"
                , "l", "g"
                , "lb", "kg"
                , "g", "l");

        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            double num = Double.parseDouble(input[0]);
            double result;
            String measure = input[1];
            result = Math.round(num * weightMap.get(measure) * 10000) / 10000.0;
            System.out.println(String.format("%.4f ", result) + measureMap.get(measure));
        }
    }
}
