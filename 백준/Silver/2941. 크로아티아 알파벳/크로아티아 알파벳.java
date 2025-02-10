import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().replace("c=", "a")
            .replace("c-", "a")
            .replace("dz=", "a")
            .replace("d-", "a")
            .replace("lj", "a")
            .replace("nj", "a")
            .replace("s=", "a")
            .replace("z=", "a");

		System.out.print(word.length());
    }
}
