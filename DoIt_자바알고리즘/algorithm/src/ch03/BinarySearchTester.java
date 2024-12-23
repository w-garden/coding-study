package ch03;

import java.util.Random;

public class BinarySearchTester {
    public static void main(String[] args) {
        Random rand = new Random(11);
        double random = Math.random();
        for (int i = 0; i < 10; i++) {
            System.out.println(rand.nextDouble(10));
        }

    }
}
