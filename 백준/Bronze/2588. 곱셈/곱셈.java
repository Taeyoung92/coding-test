import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
        int units = b%10;
        int tens = (b/10)%10;
        int hundreds = b/100;
            
		System.out.println(units*a);
		System.out.println(tens*a);
		System.out.println(hundreds*a);
        System.out.println(a*b);
	}
}