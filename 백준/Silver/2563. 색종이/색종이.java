import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] arr = new boolean[101][101];
        
        int num = Integer.parseInt(br.readLine());
        int volume = 0;
        
        for(int i=0; i<num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int row = Integer.parseInt(st.nextToken());
            int column = Integer.parseInt(st.nextToken());
            
            for(int j=row; j<row+10; j++) {
                for(int k=column; k<column+10; k++) {
                    if(!arr[j][k]) {
                        arr[j][k] = true;
                        volume++;
                    }
                }
            }
        }
        System.out.print(volume);
    }
}