import java.util.Scanner;
public class Bronze5_25372 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			String pwd=sc.next();
			if(pwd.length()>=6 && pwd.length()<=9) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		sc.close();
	}
}
