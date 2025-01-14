import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
		int quadrant;
        
        if(a*b > 0) {
            quadrant = a > 0 ? 1 : 3;
        } else {
            quadrant = a > 0 ? 4 : 2;
        }
        
        System.out.print(quadrant);
	}
}
