import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze2_1681 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int count = 0;
		int number = 0;
		while (true) {
			number++;
			String str = String.valueOf(number);
			if (str.contains(String.valueOf(L))) {
				continue;
			}
			count++;

			if (N == count) {
				System.out.println(number);
				break;
			}
		}

	}

}
