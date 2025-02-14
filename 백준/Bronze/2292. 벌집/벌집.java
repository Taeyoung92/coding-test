import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int distance = 1;
        int resion = 1;
        
        while (n > resion) {
            resion += 6 * distance;
            distance++;
        }
        System.out.println(distance);
    }
}