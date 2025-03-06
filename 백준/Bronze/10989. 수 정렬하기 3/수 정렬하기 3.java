import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] numbers = new int[N];
        int[] counting = new int[10000000];
        int[] result = new int[N];

        for(int i=0; i<numbers.length; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<numbers.length; i++) {
            counting[numbers[i]]++;
        }

        for(int i=1; i<counting.length; i++) {
            counting[i] += counting[i-1];
        }

        for(int i=numbers.length-1; i>=0; i--) {
            int value = numbers[i];
            counting[value]--;
            result[counting[value]] = value;
        }

        for(int i=0; i<N; i++) {
            bw.write(result[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
