import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze1_1296 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String yeonduName = br.readLine();

        int count = Integer.parseInt(br.readLine());
        int formulaArr[] = new int[4];
        int max = 0;
        String answer = "";
        for (int i = 0; i < count; i++) {
            String teamName = br.readLine();
            formulaArr[0] = countStr(yeonduName, 'L') + countStr(teamName, 'L');
            formulaArr[1] = countStr(yeonduName, 'O') + countStr(teamName, 'O');
            formulaArr[2] = countStr(yeonduName, 'V') + countStr(teamName, 'V');
            formulaArr[3] = countStr(yeonduName, 'E') + countStr(teamName, 'E');
            int result = formulaCalculate(formulaArr);
            if (max < result || (max == result && (answer == "" || teamName.compareTo(answer) < 0))) {
                max = result;
                answer = teamName;
            }
        }
        System.out.println(answer);
    }

    private static int formulaCalculate(int[] formulaArr) {
        int result = 1;
        for (int j = 0; j < formulaArr.length; j++) {
            for (int k = j + 1; k < formulaArr.length; k++)
                result *= (formulaArr[j] + formulaArr[k]);
        }
        return result % 100;
    }

    public static int countStr(String str, char ch) {
        return (int) str.chars().filter(c -> c == ch).count();
    }
}
