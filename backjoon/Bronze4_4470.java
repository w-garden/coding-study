import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze4_4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String strArr[] = new String[count];
        for (int i = 0; i < count; i++)
            strArr[i] = br.readLine();

        for (int i = 0; i < count; i++)
            System.out.println(i+1+". "+strArr[i]);
    }
}
