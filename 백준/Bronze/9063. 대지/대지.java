import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int minX = 0;
        int minY = 0;

        int maxX = 0;
        int maxY = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(i == 0) {
                minX = x;
                minY = y;
                maxX = x;
                maxY = y;
            } else {
                if(x < minX) {
                    minX = x;
                } else if(x > maxX) {
                    maxX = x;
                }

                if(y < minY) {
                    minY = y;
                } else if(y > maxY) {
                    maxY = y;
                }
            }


        }
        System.out.println(Math.abs((maxX - minX) * (maxY - minY)));
    }
}
