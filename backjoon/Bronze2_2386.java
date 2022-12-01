import java.util.Scanner;

public class Bronze2_2386 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			char alpahbet = sc.next().charAt(0);
			String str = sc.nextLine();
			if(alpahbet=='#') {
				break;
			}
			str=str.toLowerCase();
			int num=0;
			for(int i=0;i<str.length();i++) {
				if(alpahbet==str.charAt(i)) {
					num++;
				}
			}
			System.out.println(alpahbet+" "+num);
		}
	}
}
