import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int totalCost = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken()); // 물건의 가격
            int b = Integer.parseInt(st.nextToken()); // 물건의 개수
            
            totalCost += (a * b);
        }

        if (totalCost == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        br.close();
    }
}