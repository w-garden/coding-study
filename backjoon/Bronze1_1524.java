/**
세준세비

세준이가 키운병사 N 명
세비가 키운 병사  M 명

전투를 한다 -> 제일 약한 병사가 죽음
제일 약한 병사가 여러 명인데, 모두 같은 편이면 랜덤으로 한명 죽음
다른 편에 있다면 세비의 병사가 죽음

전쟁은 한명의 병사가 남으면 끝남

테스트 케이스 T

N M 명수
세준이의 병사들의 힘
세비의 병사들의 힘

세준이가 이기면 S
세비가 이기면 B
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bronze1_1524 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String result = "C";
        for (int i = 0; i < T; i++) {
            br.readLine();
            String[] strArr = br.readLine().split(" ");

            int N = Integer.parseInt(strArr[0]);
            int M = Integer.parseInt(strArr[1]);

            int[] sejun = new int[N];
            int[] sebi = new int[M];

            strArr = br.readLine().split(" ");

            for (int j = 0; j < sejun.length; j++)
                sejun[j] = Integer.valueOf(strArr[j]);

            strArr = br.readLine().split(" ");

            for (int j = 0; j < sebi.length; j++)
                sebi[j] = Integer.valueOf(strArr[j]);

            if (Arrays.stream(sejun).max().getAsInt() >= Arrays.stream(sebi).max().getAsInt())
                result = "S";
            else if (Arrays.stream(sejun).max().getAsInt() < Arrays.stream(sebi).max().getAsInt())
                result = "B";
            System.out.println(result);
        }
    }
}
