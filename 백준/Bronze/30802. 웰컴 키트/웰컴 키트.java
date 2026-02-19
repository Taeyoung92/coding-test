import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st2.nextToken());
        int P = Integer.parseInt(st2.nextToken());

        long tshirts = 0;
        int total = st.countTokens();

        for(int i = 0; i < total; i++){
            int num = Integer.parseInt(st.nextToken());
            if (num > 0) {
                tshirts += (num + T - 1) / T;
            }
        }

        System.out.println(tshirts);
        System.out.println(n/P + " " + n%P);
    }
}