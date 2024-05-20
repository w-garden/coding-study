import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class Bronze1_1834 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        AtomicLong result = new AtomicLong();
        IntStream.range(1, num).forEach(a -> result.addAndGet((a + (long) a * num)));

        System.out.println(result.get());
    }
}
