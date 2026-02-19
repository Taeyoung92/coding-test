import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            char[] ox = br.readLine().toCharArray();

            int totalScore = 0;
            int currentStreak = 0;

            for (char c : ox) {
                if (c == 'O') {
                    currentStreak++;
                    totalScore += currentStreak;
                } else {
                    currentStreak = 0;
                }
            }
            System.out.println(totalScore);
        }
    }
}