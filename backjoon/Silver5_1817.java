import java.util.Scanner;

public class Silver5_1817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 책의 개수
		int M = sc.nextInt(); // 박스에 넣을 수 있는 최대 무게

		int count = 0;
		int box = M;
		int[] book = new int[N];
		if (N != 0) {
			count = 1;
			for (int i = 0; i < N; i++) {
				book[i] = sc.nextInt();
			}
			for (int i = 0; i < N; i++) {

				if (box < book[i]) {
					box = M;
					box = box - book[i];
					count++;
					continue;
				}
				box = box - book[i];
			}
		}
		System.out.println(count);
	}
}
