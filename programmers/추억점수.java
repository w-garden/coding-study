public class 추억점수 {
    public static void main(String[] args) {
        String[] name = {"kali", "mari", "don"};
        int[] yearning ={11, 1, 55 };
        String[][] photo ={{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};

        int [] result =solution(name, yearning, photo);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i=0; i<photo.length ;i++) {
            int cnt = 0;
            for (int j = 0; j < photo[i].length; j++) {
                for (int k = 0; k < name.length; k++) {
                    if (name[k].equals(photo[i][j])) {
                        cnt += yearning[k];
                    }
                }
            }
            answer[i]= cnt;
        } return answer;
    }
}
