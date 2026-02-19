import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] xyz = new int[3];
            xyz[0] = Integer.parseInt(st.nextToken());
            xyz[1] = Integer.parseInt(st.nextToken());
            xyz[2] = Integer.parseInt(st.nextToken());

            if(xyz[0] == 0 && xyz[1] == 0 && xyz[1] == 0){
                break;
            }

            Arrays.sort(xyz);
            
            if(Math.pow(xyz[0], 2) + Math.pow(xyz[1], 2) == Math.pow(xyz[2], 2)) System.out.println("right");
            else System.out.println("wrong");
        }

    }
}