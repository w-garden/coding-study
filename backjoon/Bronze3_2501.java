import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bronze3_2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int a = 2;
		List<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(N);
		while (true) {
			if (N % a == 0) {
				if(a*a==N) {
					num.add(a);
					break;
				}
				else if(a*a>N){
					break;
				}
				num.add(a);
				num.add(N / a);
			}
			a++;
		}
		Collections.sort(num);
		if (num.size() < K) {
			System.out.println(0);
		} else {
			System.out.println(num.get(K - 1));
		}
	}
}
