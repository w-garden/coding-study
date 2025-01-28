package ch05;

import ch04.IntStack;

import java.util.Scanner;

//현재 n값을 '잠시' 저장합니다
//저장했던 n을 다시 꺼내 그 값을 출력합니다
public class RecurX2 {
    static void recur(int n) {
        IntStack s = new IntStack(n);

        while (true) {
            if (n > 0) {
                s.push(n);
                n = n - 1;
                continue;
            }

            if (!s.isEmpty()) {
                n = s.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int n = sc.nextInt();

        recur(n);
    }

}
