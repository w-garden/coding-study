package 코딩테스트입문;

/**
 * school.programmers.co.kr/learn/courses/30/lessons/120854
 */
public class 배열원소의길이 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"We", "are", "the", "world!"}));
        System.out.println(solution(new String[] {"I", "Love", "Programmers."}));

    }
    public static int[] solution(String[] strlist) {
        int[] answer = new int [strlist.length];
        for(int i=0; i<strlist.length;i++){
            answer[i]=strlist[i].length();
        }
        return answer;
    }
}
