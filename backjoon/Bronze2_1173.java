import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze2_1173 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		int X = m;
		int count = 0;
		int training = 0;
		if (M - m < T) {
			System.out.println(-1);
		} else {
			while (true) {
				if ((M - X) >= T) {
					X += T;
					count++;
					training++;
					if (N == training) {
						System.out.println(count);
						break;
					}
				} else if ((X - R) < m) {
					X = m;
					count++;
				} else {
					X -= R;
					count++;
				}
			}
		}
	}
}
