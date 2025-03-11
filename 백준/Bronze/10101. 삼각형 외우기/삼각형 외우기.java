import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int third = Integer.parseInt(br.readLine());

        if (first + second + third != 180) {
            System.out.print("Error");
        } else {
            if (first == 60 && second == 60 && third == 60) {
                System.out.print("Equilateral");
            } else if (first == second || second == third || third == first) {
                System.out.print("Isosceles");
            } else {
                System.out.print("Scalene");
            }
        }
    }
}
