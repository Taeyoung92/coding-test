import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean isEnd = false;

        while (isEnd == false) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 && c == 0){
                isEnd = true;
                break;
            } else {
                int max = 0;
                max = a > b ? a : b;
                max = max > c ? max : c;

                if(max >= (a+b+c-max)) {
                    System.out.println("Invalid");
                } else {
                    if(a == b && b == c && c == a){
                        System.out.println("Equilateral");
                    } else if (a != b && b != c && c != a){
                        System.out.println("Scalene");
                    } else {
                        System.out.println("Isosceles");
                    }
                }
            }
        }
    }
}
