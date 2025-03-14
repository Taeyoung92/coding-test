import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = -1;

        for (int i = n / 5; i >= 0; i--) {
            int remaining = n - (i * 5);
            if (remaining % 3 == 0) {
                int threeK = remaining / 3;
                result = i + threeK;
                break;
            }
        }

        System.out.println(result);
    }
}