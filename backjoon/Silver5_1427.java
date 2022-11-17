import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Silver5_1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
			
		String str= String.valueOf(num);
		
		Character ch[]= new Character[str.length()];
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
		}
		Arrays.sort(ch, Collections.reverseOrder());
		for(char c : ch) {
			System.out.print(c);
		}
	}	
}
