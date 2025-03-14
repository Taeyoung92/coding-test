import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int number = 0;
        while (true) {
            number++;
            String finalNumber = String.valueOf(number);
            if(finalNumber.contains("666")) {
                count++;
                if(count == N) {
                    System.out.println(finalNumber);
                    break;
                }
            }
        }
    }
}