package 코딩기초트레이닝;

import java.util.Scanner;

public class 대소문자바꿔서출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer="";
        for (char x : a.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer+=Character.toUpperCase(x);
            }
            else {
                answer+=Character.toLowerCase(x);
            }
        }
        System.out.println(answer);
    }
}
