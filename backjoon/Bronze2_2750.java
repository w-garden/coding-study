import java.util.Arrays;
import java.util.Scanner;

public class Bronze2_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		for (int a : num) {
			System.out.println(a);
		}
	}
}
