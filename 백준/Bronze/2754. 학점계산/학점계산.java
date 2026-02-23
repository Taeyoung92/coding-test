import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        double score = 0.0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'A':
                    score = 4.0;
                    break;
                case 'B':
                    score = 3.0;
                    break;
                case 'C':
                    score = 2.0;
                    break;
                case 'D':
                    score = 1.0;
                    break;
                case 'F':
                    System.out.print(score);
                    break;
                case '+':
                    System.out.println(score + 0.3);
                    break;
                case '0':
                    System.out.println(score);
                    break;
                case '-':
                    System.out.println(score - 0.3);
                    break;
            }
        }
    }
}