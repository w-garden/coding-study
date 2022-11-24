import java.util.Arrays;
import java.util.Scanner;

public class Bronze3_2476 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num[] = new int[3];
		int max = 0;
		for (int j = 0; j < N; j++) {
			int res = 0;
			for (int i = 0; i < 3; i++) {
				num[i] = sc.nextInt();
			}
			Arrays.sort(num);

			if (num[0] == num[1] && num[1] == num[2]) {
				res = 10000 + num[0] * 1000;
			} else if (num[0] == num[1]) {
				res = 1000 + num[1] * 100;
			} else if (num[1] == num[2]) {
				res = 1000 + num[1] * 100;
			} else {
				res = num[2] * 100;
			}
			if (res > max) {
				max = res;
			}
		}
		System.out.println(max);

	}
}
