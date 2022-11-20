import java.util.Scanner;

public class Bronze3_2010 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num = sc.nextInt();
		int count=0;
		for(int i=0; i<num;i++) {
			int multi=sc.nextInt();
			count+=multi;
		}
		
		System.out.println(count-num+1);
	}
}
