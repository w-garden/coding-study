import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/1297

public class Bronze2_1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStrArr = br.readLine().split(" ");

        int d = Integer.parseInt(inputStrArr[0]);
        int h = Integer.parseInt(inputStrArr[1]);
        int w = Integer.parseInt(inputStrArr[2]);

        double diagonalRate = Math.sqrt(Math.pow(h, 2) + Math.pow(w, 2));

        int resultHeight = (int) Math.floor(h * (d / diagonalRate));
        int resultWidth = (int) Math.floor(w * (d / diagonalRate));

        System.out.print(resultHeight + " " + resultWidth);
    }
}