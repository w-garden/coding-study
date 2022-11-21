import java.util.Scanner;

public class Bronze3_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int count=1;
		int hive=1;
		while(num>hive) {
			hive+=count*6;
			count++;
		}
		System.out.println(count);
	}
}
