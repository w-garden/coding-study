import java.util.Scanner;

public class Silver5_5046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 참가자의 수
		int B = sc.nextInt(); // 예산
		int H = sc.nextInt(); // 호텔의 수
		int W = sc.nextInt(); // 고를 수 있는 주의 수
		int min = B + 1;
		for (int i = 0; i < H; i++) {
			int p = sc.nextInt(); // 호텔의 일인당 숙박비용
			for (int j = 0; j < W; j++) {
				int a = sc.nextInt(); // 투숙가능한 인원

				if (N <= a && p * N <= B) {
					if (min > p * N)
						min = p * N;
				}
			}
		}
		if (min == B + 1) {
			System.out.println("stay home");
		} else {
			System.out.println(min);

		}
	}
}
