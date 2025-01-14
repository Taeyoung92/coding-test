import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int cookingTime = sc.nextInt();

        int totalMinutes = hours * 60 + minutes + cookingTime;
        
        hours = (totalMinutes / 60) % 24;
        minutes = totalMinutes % 60;

        System.out.println(hours + " " + minutes);
	}
}
