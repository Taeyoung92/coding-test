import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n; i++) {
            int H = arr[i][0];
            int W = arr[i][1];
            int N = arr[i][2];

            int floor = (N % H == 0) ? H : (N % H);
            int roomNum = (N % H == 0) ? (N / H) : (N / H) + 1;

            if (roomNum < 10) {
                System.out.println(floor + "0" + roomNum);
            } else {
                System.out.println(floor + "" + roomNum);
            }
        }

    }
}