import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        int otherX = 0;
        int otherY = 0;

        int x1 = Integer.parseInt(st1.nextToken());
        int y1 = Integer.parseInt(st1.nextToken());

        int x2 = Integer.parseInt(st2.nextToken());
        int y2 = Integer.parseInt(st2.nextToken());

        int x3 = Integer.parseInt(st3.nextToken());
        int y3 = Integer.parseInt(st3.nextToken());

        if (x1 == x2) {
            otherX = x3;
        } else if (x1 == x3){
            otherX = x2;
        } else {
            otherX = x1;
        }

        if (y1 == y2) {
            otherY = y3;
        } else if (y1 == y3){
            otherY = y2;
        } else {
            otherY = y1;
        }

        System.out.println(otherX + " " + otherY);
    }
}