import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int repeat = Integer.parseInt(br.readLine());
        
        for(int i=0; i<repeat; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int times = Integer.parseInt(st.nextToken());
            String word = st.nextToken();
            
            for(int j=0; j<word.length(); j++) {
                for(int k=0; k<times; k++) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
    }
}