import java.util.Scanner;

public class stringReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");

		String input = scanner.nextLine();
		scanner.close();
		String denReverse="";
		for(int i = 0; i<input.length(); i++){
			denReverse = input.charAt(i) + denReverse;	
		}
		System.out.println(denReverse);
	}
}