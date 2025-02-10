import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
        
        int[][] A = new int[row][column];
        int[][] B = new int[row][column];
        int[][] result = new int[row][column];
        
        for (int i = 0; i < row; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < column; j++) {
                A[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        for (int i = 0; i < row; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for (int j = 0; j < column; j++) {
                B[i][j] = Integer.parseInt(st3.nextToken());
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
