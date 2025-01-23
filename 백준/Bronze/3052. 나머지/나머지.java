import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashSet<Integer> numbers = new HashSet<>();
        
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers.add(num % 42);
        }
        
        bw.write(String.valueOf(numbers.size()));
        
        bw.flush();
        bw.close();
        br.close();
    }
}