package 연습문제;


public class 일차비밀지도 {
    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28}));
        System.out.println(solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10}));
        System.out.println(solution(6, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0}));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.setLength(0);
            String str = String.valueOf(Long.parseLong(Long.toBinaryString(arr1[i])) + Long.parseLong(Long.toBinaryString(arr2[i])));
            int num = str.length();
            for (int j = 0; j < n - num; j++)
                str = "0" + str;
            for (int j = 0; j < n; j++) {
                if (str.charAt(j) == '0')
                    sb.append(" ");
                else
                    sb.append("#");
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}
