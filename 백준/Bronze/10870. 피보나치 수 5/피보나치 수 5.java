import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n==0) {
            System.out.println(0);
        } else {
            int fibonacci = fibonacci(n+1);

            System.out.println(fibonacci);
        }
    }

    public static int fibonacci(int n) {
        if(n == 1) {
            return 0;
        } else if(n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}