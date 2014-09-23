import java.util.Random;
import java.util.Scanner;


public class AdditionQuis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int num1 = rand.nextInt(100)+1;
		int num2 = rand.nextInt(100)+1;
		int num3 = rand.nextInt(100)+1;

		int ans = num1 + num2 + num3;

		System.out.println("Quis Time!!! \n");
		System.out.println("What is the sum of " + num1 + " +" + num2 + " +" + num3 + " ?" );

		int userinput = input.nextInt();
		input.close();

		if (userinput == ans) {
			System.out.println(ans + "CORRECT!!!");

		} else {
			System.out.println("Wrong, correct answer is: " + ans);
		}
	}

}
