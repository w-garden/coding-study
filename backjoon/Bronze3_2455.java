import java.util.Scanner;

public class Bronze3_2455 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max=0;
		int sum=0;
		for(int i=0;i<4;i++) {
			int a = sc.nextInt();
			int b= sc.nextInt();
			sum-=a;
			sum+=b;
			if(sum>max) {
				max=sum;
			}
		}
		System.out.println(max);
	}
}
