import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int change = Integer.parseInt(br.readLine());
            int q = change / 25;
            change = change % 25;
            int d = change / 10;
            change = change % 10;
            int n = change / 5;
            change = change % 5;

            System.out.println(q + " " + d + " " + n + " " + change);
        }
    }
}
