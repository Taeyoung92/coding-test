import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String val = br.readLine();
            if (val.equals("0")) break;

            boolean isPalindrome = true;
            int len = val.length();

            for (int i = 0; i < len / 2; i++) {
                if (val.charAt(i) != val.charAt(len - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

