import java.util.Scanner;

public class Bronze2_1100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		String arr[] = new String[8];

		for (int i = 0; i < 8; i++) {
			arr[i] = sc.next();
		}
		for (int i = 0; i < 8; i++) {
			if ((i + 1) % 2 != 0) {
				for (int j = 1; j < 8; j += 2) {
					if (arr[i].charAt(j-1) == 'F') {
						num++;
					}
				}
			} 
			else {
				for (int j = 2; j < 10; j += 2) {
					if (arr[i].charAt(j-1) == 'F') {
						num++;
					}
				}
			}
		}
		System.out.println(num);
	}
}
