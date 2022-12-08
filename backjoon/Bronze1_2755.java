import java.util.Scanner;

public class Bronze1_2755 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.next();
		double sum = 0;
		int totalCredit=0;
		for (int i = 0; i < num; i++) {
			String str = sc.nextLine();
			String [] strArr=str.split(" ");
			int credit = Integer.parseInt(strArr[1]);
			String grade = strArr[2];
			totalCredit+=credit;
			switch (grade) {
			case "A+":
				sum+=4.3*credit;
				break;
			case "A0":
				sum+=4.0*credit;
				break;
			case "A-":
				sum+=3.7*credit;
				break;
			case "B+":
				sum+=3.3*credit;
				break;
			case "B0":
				sum+=3.0*credit;
				break;
			case "B-":
				sum+=2.7*credit;
				break;
			case "C+":
				sum+=2.3*credit;
				break;
			case "C0":
				sum+=2.0*credit;
				break;
			case "C-":
				sum+=1.7*credit;
				break;
			case "D+":
				sum+=1.3*credit;
				break;
			case "D0":
				sum+=1.0*credit;
				break;
			case "D-":
				sum+=0.7*credit;
				break;
			case "F":
				break;
			}
		}
			System.out.printf("%.2f",sum/totalCredit);
	}
}
