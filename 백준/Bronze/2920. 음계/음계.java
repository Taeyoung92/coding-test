import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String result = "";

        int count = st.countTokens(); 

        for(int i = 1; i <= count; i++){
            int pitch = Integer.parseInt(st.nextToken());

            if(pitch == i) {
                if (result.equals("descending")) { result = "mixed"; break; }
                result = "ascending";
            } else if(pitch == 9-i) {
                if (result.equals("ascending")) { result = "mixed"; break; }
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }
        System.out.println(result);
    }
}