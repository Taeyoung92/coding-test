import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] bowls = new int[N];
        
        for (int i = 0; i < bowls.length; i++) {
            bowls[i] = i + 1;
        }
        
        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            int tempNum = bowls[i];
            bowls[i] = bowls[j];
            bowls[j] = tempNum;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int b = 0; b < bowls.length; b++) {
            sb.append(bowls[b]);
            if (b < bowls.length - 1) {
                sb.append(" ");
            }
        }
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}