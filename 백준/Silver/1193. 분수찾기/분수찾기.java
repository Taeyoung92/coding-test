import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int a = 1;
        int upOrDown = -1; // up=1, down=-1

        while (n > 0) {
            upOrDown *= -1;
            n -= a;
            a++;
        }

        a--;
        n = n + a;

        int start = 0;
        int end = 0;

        if (upOrDown == -1) {
            start = 0;
            end = a+1;

            for(int i=0; i<n; i++) {
                start++;
                end--;
            }
        } else {
            start = a+1;
            end = 0;

            for(int i=0; i<n; i++) {
                start--;
                end++;
            }
        }

        System.out.println(start + "/" + end);
    }
}
