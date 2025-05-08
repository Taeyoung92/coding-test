import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        StringBuilder sb = new StringBuilder(new String(chars));

        sb.reverse();

        System.out.println(sb);
    }
}