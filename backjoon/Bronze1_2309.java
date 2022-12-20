import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bronze1_2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list= new ArrayList<>();
		int sum=0;
		for(int i=0; i<9; i++) {
			list.add(sc.nextInt());	
			sum+=list.get(i);
		}
		Loop :
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<9;j++) {
				if(list.get(i)+list.get(j) == sum-100) {
					int remove1 =list.get(i);
					int remove2 =list.get(j);
					list.remove(Integer.valueOf(remove1));
					list.remove(Integer.valueOf(remove2));
					break Loop;
				}
			}
		}
		Collections.sort(list);
		for(int a: list) {
			System.out.println(a);
		}
	}
}
