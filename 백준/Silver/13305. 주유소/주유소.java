import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer roadValue = new StringTokenizer(br.readLine());
        int[] road = new int[n-1];

        for (int i = 0; i < n-1; i++) {
            road[i] = Integer.parseInt(roadValue.nextToken());
        }

        int[] oilPrice = new int[n];

        StringTokenizer oilValue = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            oilPrice[i] = Integer.parseInt(oilValue.nextToken());
        }

        int cheapest = Integer.MAX_VALUE;

        for(int i = 0; i<oilPrice.length; i++){
            if(oilPrice[i] < cheapest){
                cheapest = oilPrice[i];
            }
        }

        int sum = road[0] * oilPrice[0];

        for(int i=1; i<road.length; i++){
            if(oilPrice[i] < oilPrice[i-1]){
                sum += road[i] * oilPrice[i];
            } else {
                sum += road[i] * oilPrice[i-1];
            }
        }

        System.out.println(sum);
    }
}