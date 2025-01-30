package ch05;

public class EightQueen {
    static boolean[] flag_a = new boolean[8];   //각 행에 퀸을 배치했는지 체크
    static boolean[] flag_b = new boolean[15];  //↙ 대각선 방향으로 퀸을 배치했는지 확인
    static boolean[] flag_c = new boolean[15]; // ↘ 대각선 방향으로 퀸을 배치했는지 확인
    static int totalCnt = 0;
    static int[] pos = new int[8];

    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
        totalCnt++;
    }

    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            if (!flag_a[j] &&
                    !flag_b[i + j] &&
                    !flag_c[i - j + 7]) {

                pos[i] = j;
                if (i == 7) {
                    print();
                } else {
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                    set(i + 1);
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
        System.out.println("총 반복 횟수 : " + totalCnt);
    }
}
