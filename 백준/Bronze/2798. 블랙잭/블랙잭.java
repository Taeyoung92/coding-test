import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer role = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(role.nextToken());
        int m = Integer.parseInt(role.nextToken());
        
        StringTokenizer cards = new StringTokenizer(br.readLine());
        
        int sum = 0;
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(cards.nextToken());
        }
        
        int temp = 0;
        
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    temp = arr[i] + arr[j] + arr[k];
                    if(temp > sum && temp <= m) sum = temp;
                }
            }
        }
        
        System.out.print(sum);
    }
}