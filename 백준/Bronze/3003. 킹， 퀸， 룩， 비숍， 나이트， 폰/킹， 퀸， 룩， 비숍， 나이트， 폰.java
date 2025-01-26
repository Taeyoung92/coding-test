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

        int[] correctPieces = {1, 1, 2, 2, 2, 8};
        int[] foundPieces = new int[6];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < 6; i++) {
            foundPieces[i] = Integer.parseInt(st.nextToken());
        }
        
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < 6; i++) {
            int difference = correctPieces[i] - foundPieces[i];
            result.append(difference).append(" ");
        }
        
        bw.write(result.toString().trim());
        
        bw.flush();
        bw.close();
        br.close();
    }
}
