import java.util.Scanner;

public class Bronze2_25755 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String direction = sc.next();
		int line = sc.nextInt();
		String arr[][] = new String[line][line];
		String arr2[][] = new String[line][line];
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line; j++) {
				arr[i][j] = sc.next();
				if (arr[i][j].equals("2")) {
					arr[i][j] = "5";
				} else if (arr[i][j].equals("5")) {
					arr[i][j] = "2";
				} else if (!arr[i][j].equals("1") && !arr[i][j].equals("8")) {
					arr[i][j] = "?";
				}
			}
		}
		switch (direction) {
		case "D":
		case "U":
			for (int i = 0; i < line; i++) {
				arr2[i] = arr[line - 1 - i];
			}
			break;
		case "L":
		case "R":
			for (int i = 0; i < line; i++) {
				for (int j = 0; j < line; j++) {
					arr2[i][j] = arr[i][line - 1 - j];
				}
			}
		}

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

	}
}
