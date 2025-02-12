import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num = st.nextToken();
        int format = Integer.parseInt(st.nextToken());
        
        int sum = 0;
        
        for(int i=0; i<num.length(); i++) {
            char ch = num.charAt(i);
            int value = 0;
            
            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else if (ch >= 'A' && ch <= 'Z') {
                value = ch - 'A' + 10;
            }
            sum = sum * format + value;
        }
        System.out.print(sum);
    }
}