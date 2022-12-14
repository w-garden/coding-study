import java.util.Scanner;

public class Bronze1_3035 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int ZR = sc.nextInt();
		int ZC = sc.nextInt();

		String arr[] = new String[R];
		sc.nextLine();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int a = 0; a < ZR; a++) {
				for (int k = 0; k < C; k++) {
					for (int j = 0; j < ZC; j++) {
						System.out.print(arr[i].charAt(k));
					}
				}
				System.out.println();
			}
		}
	}
}
