import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Character[][] chess = new Character[n][m];

        for(int i = 0; i < n; i++) {
            String line = br.readLine();
            for(int j = 0; j < m; j++) {
                chess[i][j] = line.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i <= n-8; i++) {
            for(int j = 0; j <= m-8; j++) {
                int calculateValue = calculate.rePaint(chess, i, j);
                if(calculateValue < min) {
                    min = calculateValue;
                }
            }
        }
        
        System.out.println(min);

    }
}

class calculate {
    public static int rePaint(Character[][] chess, int row, int col) {
            int startB = 0;
            int startW = 0;

            char[] colors = {'B', 'W'};

            for(int i = 0; i < 8; i++) {
                for(int j = 0; j < 8; j++) {
                    if(chess[row + i][col + j] != colors[(i + j) % 2]) {
                        startB++;
                    }
                    if(chess[row + i][col + j] != colors[(i + j + 1) % 2]) {
                        startW++;
                    }
                }
            }
        return Math.min(startB, startW);
    }
}