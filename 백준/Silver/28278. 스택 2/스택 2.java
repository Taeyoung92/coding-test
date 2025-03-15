import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int a = 0;
        int b = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            if(a == 1) {
                b = Integer.parseInt(st.nextToken());
                arr.add(b);
            } else {
                if(a == 2) {
                    if(arr.size() == 0) {
                        System.out.println(-1);
                    } else {
                        int size = arr.size();

                        if(arr.size() == 0) {
                            System.out.println(-1);
                        } else {
                            System.out.println(arr.get(size - 1));
                            arr.remove(size - 1);
                        }
                    }
                } else if(a == 3) {
                    System.out.println(arr.size());
                } else if(a == 4) {
                    if(arr.size() == 0) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                } else if(a == 5) {
                    if(arr.size() == 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(arr.get(arr.size()-1));
                    }
                }
            }
        }
    }
}