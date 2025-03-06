import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());

        Integer[] scores = new Integer[N];

        for(int i=0; i<N; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(scores);

        for(int i=0; i<N; i++) {
            bw.write(scores[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
