import java.util.Scanner;

public class Bronze1_1145 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		int result = 1;
		while (true) {
			int cnt = 0;
			for (int i = 0; i < 5; i++) {
				if (result % arr[i] == 0) {
					cnt++;
				}
			}
			if (cnt >= 3) {
				System.out.println(result);
				break;
			}
			result++;
		}
	}
}
