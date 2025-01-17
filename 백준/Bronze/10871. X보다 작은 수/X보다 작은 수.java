import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int p = sc.nextInt();
		int arr[] = new int[i];
		for(i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(i=0; i<arr.length; i++) {
			if(arr[i] < p) {
				System.out.println(arr[i]);
			}
		}
	}
}