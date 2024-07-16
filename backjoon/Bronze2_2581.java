import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;
//소수
//https://www.acmicpc.net/problem/2581
public class Bronze2_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        List<Integer> list = IntStream.rangeClosed(num1, num2)
                .filter(Bronze2_2581::isPrime)
                .boxed()
                .collect(toList());

        Optional<Integer> sum = list.stream().reduce(Integer::sum);

        int result = sum.orElse(-1);
        System.out.println(result);

        if (result != -1) System.out.println(list.get(0));

    }


    private static boolean isPrime(int candidate) {
        if (candidate == 1) return false;

        int candidateRoot = (int) Math.sqrt(candidate);

        return IntStream.rangeClosed(2, candidateRoot)
                .noneMatch(i -> candidate % i == 0);
    }
}

