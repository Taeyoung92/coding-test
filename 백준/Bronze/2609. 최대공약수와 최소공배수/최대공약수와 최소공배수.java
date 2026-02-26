import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int max = 0;
        int min = 0;

        for(int i=1; i <= n & i <= m; i++){
            if(n%i == 0 && m%i == 0) {
                max = i;
            }
        }

        min = (n*m) / max;

        System.out.println(max);
        System.out.println(min);
    }
}

