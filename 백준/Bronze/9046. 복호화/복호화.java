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
        
        int T = Integer.parseInt(br.readLine());
        
        String str = "";
        
        for (int i = 0; i < T; i++) {
            str = br.readLine().replace(" ", "");
            int max = 0;
            int count = 0;

            int[] arr = new int[26];
            
            for (int j = 0; j < str.length(); j++) {
                arr[str.charAt(j) - 'a']++;
            }
            
            for (int k = 1; k < arr.length; k++) {
                if (arr[max] < arr[k])
                    max = k;
            }
            
            for (int j = 0; j < arr.length; j++) {
                if (arr[max] == arr[j])
                    count++;

            }

            char c = (char) (max + 'a');
            if(count > 1) {
                bw.write("?" + "\n");
            } else {
                bw.write(c + "\n");
            }
            
            
        }
        bw.flush();
        bw.close();
        br.close();
    }
}