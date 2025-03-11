import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int xmin = 0;
        int ymin = 0;

        xmin = w-x > x-0 ? x : w-x;
        ymin = h-y > y ? y : h-y;

        int result = xmin > ymin ? ymin : xmin;

        System.out.println(result);
    }
}
