package 코딩테스트입문;


/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120861
 */
public class 캐릭터의좌표 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11}));
        System.out.println(solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9}));
        System.out.println(solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{1, 1}));
        System.out.println(solution(new String[]{}, new int[]{7, 9}));
    }

    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int max_width = board[0] / 2;
        int max_height = board[1] / 2;
        for (String key : keyinput) {
            switch (key) {
                case "left":
                    if (answer[0] == -max_width) break;
                    answer[0]--;
                    break;
                case "right":
                    if (answer[0] == max_width) break;
                    answer[0]++;
                    break;
                case "up":
                    if (answer[1] == max_height) break;
                    answer[1]++;
                    break;
                case "down":
                    if (answer[1] == -max_height) break;
                    answer[1]--;
            }
        }
        return answer;
    }
}
