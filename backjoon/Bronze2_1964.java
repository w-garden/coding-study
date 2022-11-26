import java.util.Scanner;

public class Bronze2_1964 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long num = 0;
		for (int i = 0; i < N; i++) {
			if (i == 0) {
				num = 5;
			} else if (i == 1) {
				num += 7;
			} else {
				num += 7 + 3 * (i - 1);
			}
		}
		System.out.println(num % 45678);
	}
}
