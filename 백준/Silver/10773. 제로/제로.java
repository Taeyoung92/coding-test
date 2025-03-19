import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num != 0) {
                arr.add(num);
            } else {
                arr.remove(arr.size()-1);
            }
        }

        long sum = 0;

        for(int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
        }

        System.out.println(sum);
    }
}