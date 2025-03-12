import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int climbPerDay = A - B;
        int days = (V - B) / climbPerDay;
        
        if ((V - B) % climbPerDay != 0) {
            days++;
        }

        bw.write(String.valueOf(days));
        bw.flush();
        bw.close();
    }
}