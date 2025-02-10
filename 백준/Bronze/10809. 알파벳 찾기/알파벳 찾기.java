import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String word = br.readLine();

        for(char c = 'a'; c <= 'z'; c++) {
            int index = word.indexOf(c);
            
            if(index != -1) {
                System.out.print(index + " ");
            } else {
                System.out.print("-1 ");
            }
        }
    }
}