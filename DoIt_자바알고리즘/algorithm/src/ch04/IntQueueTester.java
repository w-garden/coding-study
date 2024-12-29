package ch04;

import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntQueue intQueue = new IntQueue(64);

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수 : %d / %d\n", intQueue.size(), intQueue.getCapacity());
            System.out.println("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (0) 종료 : ");

            int menu = sc.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1: //인큐
                    System.out.print("데이터 : ");
                    x = sc.nextInt();
                    try {
                        intQueue.enque(x);
                    } catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;

                case 2: //디큐
                    try {
                        x = intQueue.deque();
                        System.out.println("디큐한 데이터는 " + x + "입니다.");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 3: //피크
                    try {
                        x = intQueue.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 4: //덤프
                    intQueue.dump();
                    break;
            }
        }
    }
}
