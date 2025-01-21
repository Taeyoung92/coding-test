import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] students = new int[28];
        
        for (int i = 0; i < students.length; i++) {
            students[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(students);
        
        int check = 1;
        for(int i = 0; i < students.length; i++) {
            while (check < students[i]) {
                bw.write(check + "\n");
                check++;
            }
            check++;
        }
        
        while (check <= 30) {
            bw.write(check + "\n");
            check++;
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}