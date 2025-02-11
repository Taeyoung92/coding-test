import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[][] arr = new char[5][15];
        
        for(int i=0; i<5; i++) {
            String word = br.readLine();
            for(int j=0; j<word.length(); j++) {
                arr[i][j] = word.charAt(j);
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if(arr[j][i] != '\0') result.append(arr[j][i]);
            }
        }
        
        System.out.print(result.toString());
    }
}
