package ch03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhysData[] x = {
                new PhysData("신호철", 174, 0.2),
                new PhysData("홍길동", 180, 1.2),
                new PhysData("이순신", 165, 0.7),
                new PhysData("강감찬", 175, 0.8),
                new PhysData("자바", 163, 2.0),
                new PhysData("파이썬", 185, 1.1),
                new PhysData("스프링", 155, 0.5),
                new PhysData("바티스", 163, 0.3),
        };
        System.out.println("키가 몇 cm 인사람을 찾고 있나요?");
        int height = sc.nextInt();
        int idx = Arrays.binarySearch(x, new PhysData("", height, 0.0), PhysData.HEIGHT_ORDER);

        if (idx < 0) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "] 에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]);
        }
    }

    //신체검사 데이터
    static class PhysData {
        private String name;
        private int height;
        private double vision;

        public PhysData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return name + " / " + height + " / " + vision;
        }

        //키의 오름차순으로 정렬하기 위한 comparator
        public static final Comparator<PhysData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhysData> {
            @Override
            public int compare(PhysData o1, PhysData o2) {
                return (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0;
            }
        }
    }
}
