import java.util.Scanner;

public class Bronze3_2490 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[4];

		for (int i = 0; i < 3; i++) {
			int count = 0;
			for (int j = 0; j < 4; j++) {
				num[j] = sc.nextInt();
				if (num[j] == 0) {
					count++;
				}
			}
			switch (count) {
			case 0:
				System.out.println("E");
				break;
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
			
			}
		}
	}
}
