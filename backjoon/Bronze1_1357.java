import java.util.Scanner;

public class Bronze1_1357 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(reverseNum(reverseNum(sc.nextInt()) + reverseNum(sc.nextInt())));
		sc.close();
	}

	public static int reverseNum(int num) {
		int result = 0;
		if (num / 10 == 0) {
			return num;
		}
		while (num / 10 != 0) {
			result += (num % 10);
			num /= 10;
			result *= 10;
			if (num < 10) {
				result += num;
			}
		}
		return result;
	}
}
