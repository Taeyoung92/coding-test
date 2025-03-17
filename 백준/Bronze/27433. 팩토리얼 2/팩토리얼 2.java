import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n==0) {
            System.out.println(1);
        } else {
            long factorial = fact(n);

            System.out.println(factorial);
        }
    }

    public static long fact(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fact(n - 1) * n;
        }
    }
}