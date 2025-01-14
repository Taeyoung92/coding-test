import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hours = sc.nextInt();
		int minutes = sc.nextInt();
		
		if(minutes < 45) {
			hours--;
			minutes = 60 - (45 - minutes);
		    if(hours < 0) {
		    	hours = 23;
		    }
		    System.out.println(hours + " " + minutes);
		} else {
			System.out.println(hours + " " + (minutes - 45));
		}
    }
}
