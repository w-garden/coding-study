import java.util.Scanner;

public class Bronze2_1159 {
	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		
		int number[]=new int[26];
		for(int i=0; i<num;i++) {
			number[sc.next().charAt(0)-97]++;
		}
		
		
		String result = "";
		for(int i=0; i<number.length;i++) {
			if(number[i]>=5) {
				result+=(char)(i+97);
			}
		}
		if(result=="") {
			System.out.println("PREDAJA");

		}else {
			System.out.println(result);

		}
		
		
		
		
	}
}
