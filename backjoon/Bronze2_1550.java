import java.util.Scanner;

public class Bronze2_1550 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String hexNum= sc.nextLine();
		
		int num = Integer.parseInt(hexNum, 16);
		
		System.out.println(num);
	}
}
