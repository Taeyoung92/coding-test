import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int times = num * 2 - 1;
        
        for(int i=1; i<=times; i++) {
            if(i<=num) {
                for(int j=i; j<num; j++) {
                    System.out.print(" ");
                }
                for(int k=0; k<i*2 - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for(int j=0; j<i-num; j++) {
                    System.out.print(" ");
                }
                for(int k=1; k<=(times-i)*2 + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
