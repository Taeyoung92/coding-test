import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String fst = br.readLine();
        String scd = br.readLine();
        String thd = br.readLine();

        int next = 0;

        if (fst.matches("-?\\d+")) {
            next = Integer.parseInt(fst) + 3;
        }
        else if (scd.matches("-?\\d+")) {
            next = Integer.parseInt(scd) + 2;
        }
        else if (thd.matches("-?\\d+")) {
            next = Integer.parseInt(thd) + 1;
        }

        if(next%3 == 0 && next%5 ==0) {
            System.out.println("FizzBuzz");
        } else if(next%3 == 0 && next%5 != 0) {
            System.out.println("Fizz");
        } else if(next%5 == 0 && next%3 != 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(next);
        }
    }
}

