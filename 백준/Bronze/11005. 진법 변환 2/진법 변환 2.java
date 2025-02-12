import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int num = Integer.parseInt(st.nextToken());
        int format = Integer.parseInt(st.nextToken());
        
        int sum = 0;
        
        StringBuffer sb = new StringBuffer("");
        
        while(num > 0) {
            int remainder = num % format;
            
            if (remainder >= 10) {
                sb.append((char) ('A' + (remainder - 10)));
            } else {
                sb.append(remainder);
            }
            
            num /= format;
        }
        System.out.print(sb.reverse().toString());
    }
}