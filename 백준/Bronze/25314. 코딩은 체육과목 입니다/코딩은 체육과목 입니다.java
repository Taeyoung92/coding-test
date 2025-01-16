import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String name = "";
        
        for(int i=0; i<n/4; i++){
            name += "long ";
        }
        name += "int";
        
        System.out.println(name);
    }
}