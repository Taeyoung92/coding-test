import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
    
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int max = 0;
        int count = 0;
        
        for (int i = 1; i <= 9; i++) {
            int number = Integer.parseInt(br.readLine());
            if(number > max) {
                max = number;
                count = i;
            }
        }
        
        bw.write(max + "\n" + count);
        bw.flush();
        bw.close();
        br.close();
    }
}