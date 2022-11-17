import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bronze1_1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int sum=0;
		
		List<Integer> list = new ArrayList<>();
		Loop1:
		for(int i=1; i<=b;i++) {
			for(int j=1; j<=i;j++) {
				list.add(i);
				if(list.size()==b) {
					break Loop1;
				}
			}
		}
		
		for(int i=a-1;i<b;i++) {
			sum+=list.get(i);
		}
		System.out.println(sum);
	}
}
