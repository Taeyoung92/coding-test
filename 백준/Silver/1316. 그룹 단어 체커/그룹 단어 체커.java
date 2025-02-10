import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = num;
        
        for (int i = 0; i < num; i++) {
            String str = br.readLine();

            int prev = 0;

            int[] alphabet = new int[26];

            for (int j = 0; j < str.length(); j++) {
                int now = str.charAt(j);

                if (prev != now) {
                    if (alphabet[now - 97] == 0) {
                        alphabet[now - 97]++;
                        prev = now;
                    } else {
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
