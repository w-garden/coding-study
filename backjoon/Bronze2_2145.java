import java.util.Scanner;

public class Bronze2_2145 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String num = sc.next();
			if (num.equals("0")) {
				break;
			}
			int res=calculate(num);
			while(res>=10) {
				res=calculate(String.valueOf(res));
			}
			System.out.println(res);
		}
	}
	public static int calculate(String num) {
		int sum=0;
		for(int i=0; i<num.length();i++) {
			sum+=((int)num.charAt(i)-48);
		}
		return sum;
	}
}
