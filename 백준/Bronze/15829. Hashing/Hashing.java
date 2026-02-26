import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String hash = br.readLine();

        long count = 0;

        for(int i = 0; i < num; i++){
            int ascii = hash.charAt(i);

            long hashingNum = 1;

            for(int j = 0; j < i; j++){
                hashingNum *= 31;
            }
            count += (ascii - 96) * hashingNum;
        }

        System.out.println(count);
    }
}

