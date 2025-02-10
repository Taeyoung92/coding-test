import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int len = word.length();
        int result = 1;
        
        for(int i=0; i<len/2; i++){
            if(word.charAt(i) != word.charAt(len-i-1)){
               result = 0;
               break;
            }
        }
        System.out.println(result);
    }
}
