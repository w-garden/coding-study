package 코딩테스트입문;

import java.util.*;

public class 안전지대 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}));
        System.out.println(solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}}));
        System.out.println(solution(new int[][]{{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}}));

    }

    public static int solution(int[][] board) {
        Set<String> set = new HashSet<>();
        Set<String> mine = new HashSet<>();
        Set<String> check = new HashSet<>();
        
        //전체 board좌표
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                set.add(i + "" + j);
                if (board[i][j] == 1) {
                    mine.add(i + "" + j);
                }
            }
        }
        //지뢰가 있는 지역
        for (String s : mine) {
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    check.add(((s.charAt(0) - 49) + i) + "" + ((s.charAt(1) - 49) + j));
                }
            }
        }
        //전체 board 좌표 - 지뢰가 있는 지역
        for (String s : check) {
            if (set.contains(s)) set.remove(s);
        }
        return set.size();
    }
}
