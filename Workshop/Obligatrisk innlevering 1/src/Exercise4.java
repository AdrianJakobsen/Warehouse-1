import java.util.Random;
import java.util.Scanner;


public class Exercise4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int value = rand.nextInt(2);


		System.out.println("Guess head (0) or tail (1):  ");
		int answer = input.nextInt(); 
		input.close();
		
		if(answer==value){
			System.out.println("Lucky guess!!!");
		}
		else {
			System.out.println("Wrong, the flip is: " + value );
		}




	}

}
