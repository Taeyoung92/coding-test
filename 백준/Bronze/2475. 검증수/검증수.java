import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();

        int vldNum = 0;

        while (st.hasMoreTokens()) {
            vldNum += Math.pow(Integer.parseInt(st.nextToken()), 2);
        }

        vldNum = vldNum%10;

        System.out.println(vldNum);
    }
}